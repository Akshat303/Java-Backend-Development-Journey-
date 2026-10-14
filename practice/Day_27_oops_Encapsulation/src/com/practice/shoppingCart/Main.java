package com.practice.shoppingCart;


public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Shoes", 500);

        cart.addItems(51);    // Add 51 items
        cart.removeItems(2); // Remove 2 items

        System.out.println("Product: " + cart.getProductName());
        System.out.println("Price per item: ₹" + cart.getPrice());
        System.out.println("Quantity: " + cart.getQuantity());
        System.out.println("Total: ₹" + cart.calculateTotal());
    }
}
