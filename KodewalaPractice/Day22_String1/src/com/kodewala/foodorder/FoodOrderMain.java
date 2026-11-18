package com.kodewala.foodorder;

import java.util.Scanner;

public class FoodOrderMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer name
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        // Number of items
        System.out.print("Enter Number of Items: ");
        int numberOfItems = sc.nextInt();

        // Arrays
        String[] items = new String[numberOfItems];
        double[] prices = new double[numberOfItems];

        // Taking item details
        for (int i = 0; i < numberOfItems; i++) {

            sc.nextLine();

            System.out.print("\nEnter Item " + (i + 1) + " Name: ");
            items[i] = sc.nextLine();

            System.out.print("Enter Price: ");
            prices[i] = sc.nextDouble();
        }

        // Order type
        sc.nextLine();

        System.out.print("\nEnter Order Type (NORMAL / EXPRESS / PREMIUM): ");
        String orderType = sc.nextLine();

        // Create FoodOrder object
        FoodOrder order = new FoodOrder(
                customerName,
                items,
                prices,
                orderType
        );

        // Display order
        order.displayOrder();

        sc.close();
    }
}