package com.practice.inventory;

import java.util.Scanner;

public class InventoryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] products = new String[size];
        int[] stock = new int[size];

        // Taking product details
        for (int i = 0; i < size; i++) {

            System.out.print("Enter product " + (i + 1) + " name: ");
            products[i] = sc.nextLine();

            System.out.print("Enter stock for " + products[i] + ": ");
            stock[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Creating Inventory object
        Inventory inventory = new Inventory(products, stock);

        // Search product
        System.out.print("\nEnter product name to check stock: ");
        String productName = sc.nextLine();

        inventory.checkStock(productName);

        sc.close();
    }
}