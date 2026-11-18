package com.practice.productsearch;

import java.util.Scanner;

public class ProductSearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] products = {
				"Laptop",
				"Mouse",
				"Keyboard",
				"Monitor",
				"Headphone"
		};

		double[] prices = {
				55000,
				800,
				1500,
				12000,
				2500
		};

		ProductSearch productSearch =
				new ProductSearch(products, prices);

		System.out.println("Before Sorting:");
		productSearch.displayProducts();

		// Sort products
		productSearch.sortProducts();

		System.out.println("\nAfter Sorting:");
		productSearch.displayProducts();

		// Search product
		System.out.print("\nEnter product name to search: ");
		String productName = sc.nextLine();

		productSearch.searchProduct(productName);

		// Compare product list
		String[] newProducts = {
				"Headphone",
				"Keyboard",
				"Laptop",
				"Monitor",
				"Mouse"
		};

		System.out.println("\nComparing Product Lists:");
		productSearch.compareProductList(newProducts);

		sc.close();
	}
}