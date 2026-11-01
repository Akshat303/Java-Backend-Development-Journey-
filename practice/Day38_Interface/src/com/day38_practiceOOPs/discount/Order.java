package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Order {
    private final String orderId;
    private final List<OrderItem> items;
    private DiscountStrategy discountStrategy;

    public Order(String orderId) {
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be empty.");
        }
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.discountStrategy = new NoDiscount(); // Default strategy
    }

    public void addItem(OrderItem item) {
        items.add(Objects.requireNonNull(item, "Item cannot be null."));
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = Objects.requireNonNull(discountStrategy, "DiscountStrategy cannot be null.");
    }

    public BigDecimal calculateGrossTotal() {
        return items.stream()
                .map(OrderItem::getSubTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculateDiscountAmount() {
        BigDecimal gross = calculateGrossTotal();
        return discountStrategy.applyDiscount(gross);
    }

    public BigDecimal calculateNetPayable() {
        BigDecimal gross = calculateGrossTotal();
        BigDecimal discount = calculateDiscountAmount();
        BigDecimal payable = gross.subtract(discount);
        return payable.compareTo(BigDecimal.ZERO) < 0 ? BigDecimal.ZERO : payable;
    }

    public void printReceipt() {
        BigDecimal gross = calculateGrossTotal();
        BigDecimal discount = calculateDiscountAmount();
        BigDecimal net = calculateNetPayable();

        System.out.println("==================================================");
        System.out.println("ORDER INVOICE: #" + orderId);
        System.out.println("--------------------------------------------------");
        for (OrderItem item : items) {
            System.out.printf("%-20s x%-2d @ ₹%-8.2f = ₹%.2f%n",
                    item.getItemName(), item.getQuantity(), item.getUnitPrice(), item.getSubTotal());
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Gross Total       : ₹%.2f%n", gross);
        System.out.printf("Applied Strategy  : %s%n", discountStrategy.getStrategyName());
        System.out.printf("Discount Deducted : -₹%.2f%n", discount);
        System.out.printf("Net Payable Total : ₹%.2f%n", net);
        System.out.println("==================================================\n");
    }
}