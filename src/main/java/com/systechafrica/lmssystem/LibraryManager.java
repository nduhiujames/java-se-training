package com.systechafrica.lmssystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<LibraryItem> borrowedBooks;
    private String studentNumber;

    public LibraryManager(String studentNumber) {
        this.studentNumber = studentNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(LibraryItem book) {
        // Implement the logic to borrow a book and add it to the borrowedBooks list
        borrowedBooks.add(book);
        System.out.println("Book borrowed successfully: " + book.getTitle());
    }

    public void returnBook(String ISBN) {
        // Implement the logic to return a book and remove it from the borrowedBooks
        // list
        LibraryItem bookToRemove = null;

        for (LibraryItem book : borrowedBooks) {
            if (book.getISBN().equals(ISBN)) {
                bookToRemove = book;
                break;
            }
        }

        if (bookToRemove != null) {
            borrowedBooks.remove(bookToRemove);
            System.out.println("Book returned successfully: " + bookToRemove.getTitle());
        } else {
            System.out.println("Book with ISBN " + ISBN + " not found in the list of borrowed books.");
        }
    }

    public List<LibraryItem> getBorrowedBooks() {
        return borrowedBooks;
    }
}
