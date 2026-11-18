package com.single.orderManagement;

public class Main {

    public static void main(String[] args) {

        Order order = new ExpressOrder(
                "ORD001",
                2000,
                150
        );

        System.out.println("Order Amount : ₹" + order.getOrderAmount());
        System.out.println("Final Amount With Delivery Charge : ₹" +
                order.calculateFinalAmount());
    }
}