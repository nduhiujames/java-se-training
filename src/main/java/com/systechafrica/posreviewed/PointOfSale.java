package com.systechafrica.posreviewed;

public interface PointOfSale {
    void displayMenu();
    void addItem() throws InvalidInputException;
    void makePayment() throws InsufficientPaymentException;
    void displayReceipt();
}