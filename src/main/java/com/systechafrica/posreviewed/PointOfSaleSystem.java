package com.systechafrica.posreviewed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PointOfSaleSystem {
    private static final Logger logger = Logger.getLogger(PointOfSaleSystem.class.getName());
    private List<MenuItem> cart;

    public PointOfSaleSystem() {
        this.cart = new ArrayList<>();
    }

    private Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3309/pos";
        String user = "javase";
        String password = "javase";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to connect to the database.", e);
        }
        return connection;
    }

    private void logMessage(Level level, String message, Exception e) {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.log(level, message, e);
            fileHandler.close();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Failed to log message.", ex);
        }
    }

    public void displayMenu() {
        System.out.println("----------------------------");
        System.out.println("SYSTECH POS SYSTEM");
        System.out.println("----------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");
        System.out.println("Choose an option:");
    }

    public void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();

        MenuItem menuItem = new MenuItem(itemCode, quantity, unitPrice);
        cart.add(menuItem);
        logMessage(Level.INFO, "Item added: " + itemCode, null);
    }

    public void makePayment() {
        double totalDue = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Item Code\tQuantity\tUnit Price\tTotalValue");
        for (MenuItem menuItem : cart) {
            System.out.printf("%s\t%d\t%.2f\t%.2f%n",
                    menuItem.getItemCode(), menuItem.getQuantity(),
                    menuItem.getUnitPrice(), menuItem.getTotalValue());
            totalDue += menuItem.getTotalValue();
        }

        System.out.println("Total Due: $" + totalDue);
        System.out.println("*********************************************************");

        double amountGiven = 0.0;
        while (amountGiven < totalDue) {
            System.out.print("Enter the amount given by Customer:");
            amountGiven = scanner.nextDouble();

            if (amountGiven < totalDue) {
                System.out.println("Insufficient payment. Please provide enough funds.");
            }
        }

        double change = amountGiven - totalDue;

        System.out.println("Change: $" + change);
        System.out.println("*********************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("*********************************************************");

        cart.clear(); // Clear the cart after payment
        // Insert payment data into the database
        try (Connection connection = connectToDatabase()) {
            if (connection != null) {
                String insertQuery = "INSERT INTO payments (total_due, amount_given, change_amount) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setDouble(1, totalDue);
                preparedStatement.setDouble(2, amountGiven);
                preparedStatement.setDouble(3, change);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to insert payment data into the database.", e);
        }
    }

    public void displayReceipt() {
        System.out.println("Item Code\tQuantity\tUnit Price\tTotalValue");
        for (MenuItem menuItem : cart) {
            System.out.printf("%-10s\t%-8d\t%-11.2f\t%-10.2f%n",
                    menuItem.getItemCode(), menuItem.getQuantity(),
                    menuItem.getUnitPrice(), menuItem.getTotalValue());
        }

        double totalDue = cart.stream()
                .mapToDouble(MenuItem::getTotalValue)
                .sum();

        System.out.println("Total Due: $" + totalDue);
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
    }

    public static void main(String[] args) {
        logger.setLevel(Level.ALL);
        User user = new User();
        if (user.login()) {
            PointOfSaleSystem pos = new PointOfSaleSystem();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                pos.displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        pos.addItem();
                        break;
                    case 2:
                        pos.makePayment();
                        break;
                    case 3:
                        pos.displayReceipt();
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }

}
