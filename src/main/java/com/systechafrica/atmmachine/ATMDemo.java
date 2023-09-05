package com.systechafrica.atmmachine;

import java.util.Scanner;

public class ATMDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static String password = "Admin123";
    private static double balance = 1000.0;
    private static double withdrawalFeeRate = 0.02; // 2% withdrawal fee
    private static int loginAttempts = 3;

    public static void main(String[] args) {
        ATMDemo atm = new ATMDemo();
        atm.login();

    }

    public void login() {
        while (loginAttempts > 0) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("Login successful!");
                showMainMenu();
                break;
            } else {
                loginAttempts--;
                if (loginAttempts > 0) {
                    System.out.println("Incorrect password. You have " + loginAttempts + " attempts remaining.");
                } else {
                    System.out.println("Exhausted login attempts. Exiting...");
                    return;
                }
            }
        }

    }

    public void showMainMenu() {
        while (true) {
            System.out.println(
                    "***************\nATM SIMULATOR\n\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\nATM SERVICES\n__________________");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Cash");
            System.out.println("5. Quit\n\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");

            System.out.print("Choose your option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    performDeposit();
                    break;
                case 3:
                    performWithdrawal();
                    break;
                case 4:
                    performTransfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: Ksh " + balance);
    }

    public void performDeposit() {
        System.out.print("Enter the amount to deposit: Ksh ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit successful. Your new balance is: Ksh " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void performWithdrawal() {
        System.out.print("Enter the amount to withdraw: Ksh ");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            double withdrawalFee = withdrawAmount * withdrawalFeeRate;
            balance -= (withdrawAmount + withdrawalFee);
            System.out.println("Withdrawal successful. Your new balance is: Ksh " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }

    }

    public void performTransfer() {
        System.out.println("Transfer Cash not available for now.");

    }

    public void printReceipt() {
        System.out.println("Receipt:");
        System.out.println("Transaction: Print Receipt");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Time: " + java.time.LocalTime.now());
        System.out.println("Balance: Ksh " + balance);
        System.out.println("Thank you for using our ATM!");
    }

}
