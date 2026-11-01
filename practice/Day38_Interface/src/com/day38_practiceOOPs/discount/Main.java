package com.day38_practiceOOPs.discount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-2026-9081");

        // Add items to cart
        order.addItem(new OrderItem("ITM01", "Mechanical Keyboard", new BigDecimal("3500.00"), 1));
        order.addItem(new OrderItem("ITM02", "Ergonomic Mouse", new BigDecimal("1200.00"), 1));
        order.addItem(new OrderItem("ITM03", "Type-C Cable", new BigDecimal("300.00"), 2));

        // 1. Initial State: No Discount
        System.out.println("CASE 1: No Coupon Applied");
        order.printReceipt();

        // 2. Apply Flat ₹50 Strategy at runtime
        System.out.println("CASE 2: Customer applies 'FLAT50'");
        order.setDiscountStrategy(new FlatFiftyDiscount());
        order.printReceipt();

        // 3. Switch strategy at runtime to 15% capped at ₹200
        System.out.println("CASE 3: Customer switches to 'FESTIVE15' (15% up to ₹200)");
        order.setDiscountStrategy(new PercentageDiscount(15.0, new BigDecimal("200.00")));
        order.printReceipt();
    }
}