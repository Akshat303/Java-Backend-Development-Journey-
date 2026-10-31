package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;

public class OrderItem {
    private final String itemId;
    private final String itemName;
    private final BigDecimal unitPrice;
    private final int quantity;

    public OrderItem(String itemId, String itemName, BigDecimal unitPrice, int quantity) {
        if (itemId == null || itemId.isBlank()) throw new IllegalArgumentException("Item ID required.");
        if (itemName == null || itemName.isBlank()) throw new IllegalArgumentException("Item Name required.");
        if (unitPrice == null || unitPrice.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Unit price must be positive.");
        }
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be at least 1.");

        this.itemId = itemId;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
}