package com.practice.ecommerce;

public class Main {
    public static void main(String[] args) {
        PhysicalProduct phoneCase = new PhysicalProduct("P101", "Phone Case", 1000, 0.2, 100);
        DigitalProduct ebook = new DigitalProduct("D202", "E-Book", 500, 5, 3);

        Order order = new Order();
        order.addProduct(phoneCase, 1);
        order.addProduct(ebook, 1);

        order.displayOrderDetails();
    }
}
