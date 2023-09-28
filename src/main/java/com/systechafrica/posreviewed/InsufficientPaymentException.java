package com.systechafrica.posreviewed;

public class InsufficientPaymentException extends Exception {
    public InsufficientPaymentException(String message) {
        super(message);
    }
}
