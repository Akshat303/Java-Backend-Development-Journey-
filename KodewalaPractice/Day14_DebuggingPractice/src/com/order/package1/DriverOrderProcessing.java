package com.order.package1;

public class DriverOrderProcessing {

    public static void main(String[] args) {
    	OrderProcessing pipeline = new OrderProcessing();

        pipeline.placeOrder("Wireless Mouse", 2, 899.0);
        System.out.println("---");
        pipeline.placeOrder("Mechanical Keyboard", 15, 3499.0);
    }
}