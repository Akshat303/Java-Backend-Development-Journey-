package com.practice.productsearch;

import java.util.Arrays;

public class ProductSearch {

	private String[] products;
	private double[] prices;

	public ProductSearch(String[] _products, double[] _prices) {
		this.products = _products;
		this.prices = _prices;
	}

	public void sortProducts() {

		// Store original data before sorting
		String[] originalProducts = Arrays.copyOf(products, products.length);
		double[] originalPrices = Arrays.copyOf(prices, prices.length);

		// Sort product names
		Arrays.sort(products);

		// Re-arrange prices according to sorted product names
		for (int i = 0; i < products.length; i++) {

			for (int j = 0; j < originalProducts.length; j++) {

				if (products[i].equals(originalProducts[j])) {

					prices[i] = originalPrices[j];
					break;
				}
			}
		}

		System.out.println("Products sorted successfully.");
	}

	public void searchProduct(String productName) {

	    productName = productName.toLowerCase();

	    int result = -1;

	    for (int i = 0; i < products.length; i++) {

	        if (products[i].toLowerCase().equals(productName)) {
	            result = i;
	            break;
	        }
	    }

	    if (result >= 0) {
	        System.out.println("Product Found");
	        System.out.println("Product: " + products[result]);
	        System.out.println("Price: ₹" + prices[result]);
	    } else {
	        System.out.println("Product Not Found");
	    }
	}

	public void displayProducts() {

		System.out.println("\nProduct List:");

		for (int i = 0; i < products.length; i++) {

			System.out.println(
					"Product: " + products[i] +
					" | Price: ₹" + prices[i]);
		}
	}

	public void compareProductList(String[] newProducts) {

		// Create another array using Arrays.copyOf()
		String[] copiedProducts = Arrays.copyOf(products, products.length);

		// Compare both arrays
		if (Arrays.equals(copiedProducts, newProducts)) {
			System.out.println("Both product lists are equal.");
		} else {
			System.out.println("Product lists are different.");
		}
	}
}