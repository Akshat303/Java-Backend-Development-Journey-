package com.practice.Inventory;

public class Product {
	private String productName;
	private String description;
	private int quantity;
	private double price;

	// Constructor
	public Product(String productName, String description, int quantity, double price) {
		this.productName = productName;
		this.description = description;
		this.quantity = Math.max(quantity, 0); // prevent negative
		this.price = Math.max(price, 0); // prevent negative
	}

	// Getters
	public String getProductName() {
		return productName;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	// Add stock
	public void addStock(int quantity) {
		if (quantity > 0) {
			this.quantity += quantity;
		}
	}

	// Sell product
	public boolean sellProduct(int quantity) {
		if (quantity > 0 && quantity <= this.quantity) {
			this.quantity -= quantity;
			return true;
		}
		System.out.println("❌ Cannot sell " + quantity + " items. Available stock: " + this.quantity);
		return false;
	}
}
