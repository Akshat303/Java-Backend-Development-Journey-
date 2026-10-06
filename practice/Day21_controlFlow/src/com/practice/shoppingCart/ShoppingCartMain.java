package com.practice.shoppingCart;

import java.util.Scanner;

public class ShoppingCartMain {

	public static void main(String[] args) {

//		double[] prices = { 1200, 500, 800, 1500 };
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int size = sc.nextInt();

        double[] prices = new double[size];

        for (int i = 0; i < prices.length; i++) {

            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

		ShoppingCart cart = new ShoppingCart(prices);

		System.out.println("Final Amount: ₹" + cart.calculateFinalAmount());
	}
}