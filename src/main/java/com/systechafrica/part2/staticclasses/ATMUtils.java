package com.systechafrica.part2.staticclasses;

public class ATMUtils {

    public static void main(String[] args) {
        String creditCardNumber = "1234-5678-9012-3456";
        String maskedCardNumber = maskCreditCard(creditCardNumber);
        System.out.println("Masked Credit Card Number: " + maskedCardNumber);
    }

    public static String maskCreditCard(String creditCardNumber) {
        // Define the character used for masking (e.g., "*")
        char maskChar = '*';

        // Remove any non-digit characters from the credit card number
        String cleanNumber = creditCardNumber.replaceAll("[^0-9]", "");

        // Check if the cleaned number has at least 4 digits (minimum required for a
        // valid credit card)
        if (cleanNumber.length() >= 4) {
            // Get the last 4 digits of the card number
            String lastFourDigits = cleanNumber.substring(cleanNumber.length() - 4);

            // Create the masked string with '*' characters
            String maskedDigits = new String(new char[cleanNumber.length() - 4]).replace('\0', maskChar);

            // Combine the masked digits with the last four digits
            String maskedCardNumber = maskedDigits + lastFourDigits;

            // Format the masked card number with dashes (e.g., "****-****-****-3456")
            StringBuilder formattedMaskedCardNumber = new StringBuilder();
            for (int i = 0; i < maskedCardNumber.length(); i++) {
                if (i > 0 && i % 4 == 0) {
                    formattedMaskedCardNumber.append('-');
                }
                formattedMaskedCardNumber.append(maskedCardNumber.charAt(i));
            }

            return formattedMaskedCardNumber.toString();
        } else {
            // If the input is not a valid credit card number, return it as is
            return creditCardNumber;
        }

    }
}
