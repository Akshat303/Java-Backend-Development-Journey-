package com.practice.ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
	private List<Product> products;

	public Order() {
		this.products = new ArrayList<>();
	}

	// Controlled method to add product
	public void addProduct(Product product, int quantity) {
		if (product == null || quantity <= 0) {
			System.out.println("❌ Invalid product or quantity.");
			return;
		}
		double cost = product.calculateTotalCost(quantity);
		products.add(product);
		System.out.println("✅ Added " + quantity + " x " + product.getName() + " | Cost: ₹" + cost);
	}

	// Calculate total
	public double calculateTotal() {
		double total = 0;
		for (Product p : products) {
			// For simplicity, assume each product added once with its cost already
			// validated
			// In real system, we’d store quantity separately
			total += p.calculateTotalCost(1);
		}
		return total;
	}

	// Read-only access
	public List<Product> getProducts() {
		return Collections.unmodifiableList(products);
	}

	public void displayOrderDetails() {
		System.out.println("Order Details:");
		for (Product p : products) {
			System.out.println("- " + p.getName() + " (₹" + p.getPrice() + ")");
		}
		System.out.println("Total Order Price: ₹" + calculateTotal());
	}
}
