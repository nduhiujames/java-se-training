package com.systechafrica.possystem;

public class MenuItem {
    private String itemCode;
    private int quantity;
    private double unitPrice;

    public MenuItem(String itemCode, int quantity, double unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotalValue() {
        return quantity * unitPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
