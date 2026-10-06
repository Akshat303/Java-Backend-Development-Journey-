package com.practice.inventory;

public class Inventory {

    private String[] products;
    private int[] stock;

    public Inventory(String[] products, int[] stock) {
        this.products = products;
        this.stock = stock;
    }

    public void checkStock(String productName) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].equalsIgnoreCase(productName)) {

                if (stock[i] == 0) {
                    System.out.println("Out of Stock");
                }
                else if (stock[i] <= 5) {
                    System.out.println("Low Stock: " + stock[i]);
                }
                else {
                    System.out.println(
                            "Available Stock: " + stock[i]
                    );
                }

                return;
            }
        }

		System.out.println("Product not found");
	}
}