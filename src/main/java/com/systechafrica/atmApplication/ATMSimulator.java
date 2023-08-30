package com.systechafrica.atmApplication;

import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;
        final String PASSWORD = "Admin123";
        double balance = 1000.0; // Initial balance
        
        // Login loop
        while (loginAttempts < 3) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            
            // Checking if entered password matches the predefined password
            if (inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else {
                loginAttempts++;
                System.out.println("Incorrect password. Attempts remaining: " + (3 - loginAttempts));

                // If login attempts exhausted, exit the program
                if (loginAttempts == 3) {
                    System.out.println("Login attempts exhausted. Exiting...");
                    return;
                }
            }
        }
        //Main ATM operations loop
        while (true) {
            System.out.println("\n***************\nATM SIMULATOR\n\"\"\"\"\"\"\"\"\"\"\"\"\"\"\nATM SERVICES\n__________________\n" +
                    "1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transfer Cash\n5. Quit\n\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
            System.out.print("\nChoose your option: ");
            int choice = scanner.nextInt();
            
            // Perform operation based on user's choice
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Ksh " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful. Your new balance is: Ksh " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    double withdrawalCharge = withdrawAmount * 0.02;
                    
                    if (withdrawAmount > 0 && balance >= (withdrawAmount + withdrawalCharge)) {
                        balance -= (withdrawAmount + withdrawalCharge);
                        System.out.println("Withdrawal successful. Your new balance is: Ksh " + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                case 4:
                System.out.print("Enter the account number To Transfer Funds: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter the amount to transfer: ");
                double transferAmount = scanner.nextDouble();
                if (transferAmount <= balance) {
                    balance -= transferAmount;
                    System.out.println("Transferred: Ksh " + transferAmount + " to account " + accountNumber);
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;
                    
                case 5:
                    System.out.println("Exiting ATM simulator. Have a nice day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
        
    }
    
}
