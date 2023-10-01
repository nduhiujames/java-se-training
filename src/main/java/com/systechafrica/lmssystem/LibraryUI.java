package com.systechafrica.lmssystem;

import java.util.Scanner;

public class LibraryUI {
    public static void main(String[] args) {
        // Initialize the database and create tables
        LibraryDatabase.createTables();

        Scanner scanner = new Scanner(System.in);
        int loginAttempts = 0;
        LibraryManager libraryManager = null; // Initialize the library manager

        while (loginAttempts < 3) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (password.equals("Admin123")) {
                System.out.println("Login successful.");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                loginAttempts++;
            }
        }

        if (loginAttempts == 3) {
            System.out.println("Maximum login attempts reached. Exiting.");
            System.exit(1);
        }

        while (true) {
            // Display the menu and handle user input
            System.out.println("SYSTECH Library Management System:");
            System.out.println("1. Borrow a Book");
            System.out.println("2. View borrowed books");
            System.out.println("3. Return a book");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Borrow a Book
                    if (libraryManager == null) {
                        System.out.print("Enter your student number: ");
                        String studentNumber = scanner.nextLine();
                        libraryManager = new LibraryManager(studentNumber);
                    }

                    System.out.print("Enter ISBN number: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    LibraryItem book = (LibraryItem) new Book(isbn, title);
                    libraryManager.borrowBook(book);
                    break;
                case 2:
                    // View borrowed books
                    if (libraryManager != null) {
                        for (LibraryItem borrowedBook : libraryManager.getBorrowedBooks()) {
                            System.out.println("ISBN: " + borrowedBook.getISBN());
                            System.out.println("Title: " + borrowedBook.getTitle());
                            System.out.println();
                        }
                    } else {
                        System.out.println("No books borrowed yet.");
                    }
                    break;
                case 3:
                    // Return a book
                    if (libraryManager != null) {
                        System.out.print("Enter ISBN number of the book to return: ");
                        String returnISBN = scanner.nextLine();
                        libraryManager.returnBook(returnISBN);
                    } else {
                        System.out.println("No books borrowed yet.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

