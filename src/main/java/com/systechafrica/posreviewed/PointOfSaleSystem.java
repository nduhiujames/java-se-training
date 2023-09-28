package com.systechafrica.posreviewed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PointOfSaleSystem implements PointOfSale {
    private List<MenuItem> cart;

    public PointOfSaleSystem() {
        this.cart = new ArrayList<>();
    }

    @Override
    public void displayMenu() {
        System.out.println("----------------------------");
        System.out.println("SYSTECH POS SYSTEM");
        System.out.println("----------------------------");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");
        System.out.println("Choose an option:");
    }

    @Override
    public void addItem() throws InvalidInputException {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Enter Item Code: ");
                String itemCode = scanner.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter Unit Price: ");
                double unitPrice = scanner.nextDouble();

                if (quantity <= 0 || unitPrice <= 0) {
                    throw new InvalidInputException("Invalid input. Quantity and unit price must be positive.");
                }

                MenuItem menuItem = new MenuItem(itemCode, quantity, unitPrice);
                cart.add(menuItem);
            } catch (java.util.InputMismatchException e) {
                throw new InvalidInputException("Invalid input format. Please enter valid numbers.");
            }
        }
    }

    @Override
    public void makePayment() throws InsufficientPaymentException {
        double totalDue = calculateTotalDue();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Item Code\tQuantity\tUnit Price\tTotalValue");
            for (MenuItem menuItem : cart) {
                System.out.printf("%s\t%d\t%.2f\t%.2f%n",
                        menuItem.getItemCode(), menuItem.getQuantity(),
                        menuItem.getUnitPrice(), menuItem.getTotalValue());
            }

            System.out.println("Total Due: $" + totalDue);
            System.out.println("*********************************************************");
            System.out.print("Enter the amount given by Customer: ");
            double amountGiven = scanner.nextDouble();

            if (amountGiven < totalDue) {
                throw new InsufficientPaymentException("Insufficient payment. Please provide enough funds.");
            }

            double change = amountGiven - totalDue;

            System.out.println("Change: $" + change);
        }

        System.out.println("*********************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("*********************************************************");

        cart.clear(); // Clear the cart after payment
    }

    private double calculateTotalDue() {
        double totalDue = 0.0;
        for (MenuItem menuItem : cart) {
            totalDue += menuItem.getTotalValue();
        }
        return totalDue;
    }

    @Override
    public void displayReceipt() {
        System.out.println("Item Code\tQuantity\tUnit Price\tTotalValue");
        for (MenuItem menuItem : cart) {
            System.out.printf("%-10s\t%-8d\t%-11.2f\t%-10.2f%n",
                    menuItem.getItemCode(), menuItem.getQuantity(),
                    menuItem.getUnitPrice(), menuItem.getTotalValue());
        }

        double totalDue = calculateTotalDue();

        System.out.println("Total Due: $" + totalDue);
        System.out.println("*********************************************************");
        System.out.println("*********************************************************");
    }

    public static void main(String[] args) {
        User user = new User();
        if (user.login()) {
            PointOfSale pos = new PointOfSaleSystem();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                pos.displayMenu();
                int choice = scanner.nextInt();

                try {
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
                } catch (InvalidInputException | InsufficientPaymentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
