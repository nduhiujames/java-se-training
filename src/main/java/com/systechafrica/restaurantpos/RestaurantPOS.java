package com.systechafrica.restaurantpos;

import java.util.List;
import java.util.Scanner;

public class RestaurantPOS {
    private static final String PASSWORD = "Admin123";
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;

        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter password to login: ");
            String password = scanner.nextLine();

            if (password.equals(PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
                loginAttempts++;
            }
        }

        if (loginAttempts == MAX_LOGIN_ATTEMPTS) {
            System.out.println("Max login attempts reached. Exiting.");
            System.exit(1);
        }

        Menu menu = createMenu();
        Order order = new Order();
        displayMenu(menu);

        while (true) {
            System.out.print("Choose your Drink/Meal (Enter item number or '7' to Quit): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                break;
            }

            if (choice >= 1 && choice <= menu.getDrinks().size()) {
                order.addItem(menu.getDrinks().get(choice - 1));
            } else if (choice > menu.getDrinks().size() && choice <= menu.getDrinks().size() + menu.getMeals().size()) {
                order.addItem(menu.getMeals().get(choice - 1 - menu.getDrinks().size()));
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Do you want to enter another meal/drink option (Y/N): ");
            scanner.nextLine(); // Consume newline
            String anotherChoice = scanner.nextLine();
            if (!anotherChoice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.print("Proceed to Payment (Y/N): ");
        String proceedToPayment = scanner.next();

        if (proceedToPayment.equalsIgnoreCase("Y")) {
            double total = order.calculateTotal();
            System.out.println("Pay Now For:");
            for (MenuItem item : order.getItems()) {
                System.out.println(item.getName() + "----------------------" + item.getPrice());
            }
            System.out.println("***************************************************************");
            System.out.println("Total:-----------------------" + total);
            System.out.print("Enter amount to pay: ");
            double amountPaid = scanner.nextDouble();
            double balance = amountPaid - total;
            System.out.println("Your Balance is-----------------" + balance);
            System.out.println("***************************************************************");
        }
    }

    private static Menu createMenu() {
        Menu menu = new Menu();
        menu.addDrink(new MenuItem("Chai", 15));
        menu.addDrink(new MenuItem("Andazi", 10));
        menu.addDrink(new MenuItem("Tosti", 12));
        menu.addMeal(new MenuItem("NDENGU AND ACCOMPLISHMENTS", 70));
        menu.addMeal(new MenuItem("BEANS AND ACCOMPLISHMENTS", 70));
        menu.addMeal(new MenuItem("PILAU VEG", 90));
        return menu;
    }

    private static void displayMenu(Menu menu) {
        System.out.println("SYSTECH RESTAURANT:");
        System.out.println("DRINKS");
        System.out.println("-------------------------------------------------------------------------");
        List<MenuItem> drinks = menu.getDrinks();
        for (int i = 0; i < drinks.size(); i++) {
            System.out.println((i + 1) + ". " + drinks.get(i));
        }
        System.out.println("MEALS");
        System.out.println("-------------------------------------------------------------------------");
        List<MenuItem> meals = menu.getMeals();
        for (int i = 0; i < meals.size(); i++) {
            System.out.println((i + 1 + drinks.size()) + ". " + meals.get(i));
        }
        System.out.println("7. Quit");
    }

}
