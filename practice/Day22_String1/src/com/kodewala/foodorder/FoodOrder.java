package com.kodewala.foodorder;

import java.util.Arrays;

public class FoodOrder {

    private String customerName;
    private String[] items;
    private double[] prices;
    private String orderType;

    private static int totalOrders;

    // Constructor
    public FoodOrder(String _customerName, String[] _items, double[] _prices, String _orderType) {
        this.customerName = _customerName;
        this.items = _items;
        this.prices = _prices;
        this.orderType = _orderType;

        totalOrders++;
    }

    // Calculate subtotal
    public double calculateSubtotal() {

        double subtotal = 0;

        for (int i = 0; i < prices.length; i++) {
            subtotal = subtotal + prices[i];
        }

        return subtotal;
    }

    // Calculate delivery charge using switch
    public double calculateDeliveryCharge() {

        double deliveryCharge = 0;

        switch (orderType.toUpperCase()) {

        case "NORMAL":
            deliveryCharge = 40;
            break;

        case "EXPRESS":
            deliveryCharge = 80;
            break;

        case "PREMIUM":
            deliveryCharge = 120;
            break;

        default:
            System.out.println("Invalid order type.");
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }

    // Calculate discount using if / else if / else
    public double calculateDiscount() {

        double subtotal = calculateSubtotal();
        double discount = 0;

        if (subtotal >= 3000) {
            discount = subtotal * 0.20;
        } 
        else if (subtotal >= 2000) {
            discount = subtotal * 0.15;
        } 
        else if (subtotal >= 1000) {
            discount = subtotal * 0.10;
        } 
        else {
            discount = 0;
        }

        return discount;
    }

    // Calculate final amount
    public double calculateFinalAmount() {

        double subtotal = calculateSubtotal();
        double deliveryCharge = calculateDeliveryCharge();
        double discount = calculateDiscount();

        double finalAmount = subtotal + deliveryCharge - discount;

        return finalAmount;
    }

    // Display complete order
    public void displayOrder() {

        System.out.println("\n========== FOOD ORDER ==========");

        System.out.println("Customer Name : " + customerName);
        System.out.println("Order Type    : " + orderType);

        System.out.println("\nItems:");

        for (int i = 0; i < items.length; i++) {

            System.out.println(
                (i + 1) + ". " + items[i] + " - ₹" + prices[i]
            );
        }

        double subtotal = calculateSubtotal();
        double deliveryCharge = calculateDeliveryCharge();
        double discount = calculateDiscount();
        double finalAmount = calculateFinalAmount();

        // Create backup of prices
        double[] backupPrices = Arrays.copyOf(prices, prices.length);

        // Sort backup only
        Arrays.sort(backupPrices);

        double cheapestPrice = backupPrices[0];
        double expensivePrice = backupPrices[backupPrices.length - 1];

        System.out.println("\n---------- BILL DETAILS ----------");

        System.out.println("Subtotal          : ₹" + subtotal);
        System.out.println("Delivery Charge   : ₹" + deliveryCharge);
        System.out.println("Discount          : ₹" + discount);
        System.out.println("Final Amount      : ₹" + finalAmount);

        System.out.println("\n---------- PRICE DETAILS ----------");

        System.out.println("Cheapest Item Price      : ₹" + cheapestPrice);
        System.out.println("Most Expensive Item Price : ₹" + expensivePrice);

        System.out.println("\nTotal Orders Created : " + totalOrders);

        System.out.println("==================================");
    }
}