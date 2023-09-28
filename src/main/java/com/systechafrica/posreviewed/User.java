package com.systechafrica.posreviewed;

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

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        while (loginAttempts < MAX_LOGIN_ATTEMPTS) {
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            if (enteredPassword.equals(password)) {
                System.out.println("Successful login.");
                return true;
            } else {
                System.out.println("Incorrect password. Try again.");
                loginAttempts++;
            }
        }
        System.out.println("Maximum login attempts reached. Exiting.");
        return false;
    }

}
