package com.systechafrica.posreviewed;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    private static final String DEFAULT_PASSWORD = "Admin123";
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    private String password;
    private int loginAttempts;

    public User() {
        this.password = DEFAULT_PASSWORD;
        this.loginAttempts = 0;
    }

    public boolean login() throws PointOfSaleException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter logWriter = new FileWriter("log1.txt", true)) {
            while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
                System.out.print("Enter password: ");
                String enteredPassword = scanner.nextLine();
                if (enteredPassword.equals(password)) {
                    System.out.println("Successful login.");
                    logWriter.write("Successful login by admin\n");
                    return true;
                } else {
                    System.out.println("Incorrect password. Try again.");
                    logWriter.write("Login attempt failed: Incorrect password\n");
                    loginAttempts++;
                }
            }
            throw new PointOfSaleException("Maximum login attempts reached. Exiting.");
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
            return false;
        }
    }

}
