package com.practice.shoppingCart;

public class ShoppingCart {

	private String productName;
	private double price;
	private int quantity;

	// Constructor
	public ShoppingCart(String productName, double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price must be greater than zero.");
		}
		this.productName = productName;
		this.price = price;
		this.quantity = 0; // start with zero items
	}

	// Add items
	public void addItems(int quantity) {
		if (quantity > 0) {
			this.quantity += quantity;  // this.quantity → the field inside the object (the cart’s stored quantity).
										// quantity → the method parameter passed in.
		}
	}

	// Remove items safely
	public void removeItems(int quantity) {
		if (quantity > 0) {
			if (quantity <= this.quantity) {
				this.quantity -= quantity; // this.quantity → the field inside the object (the cart’s stored quantity).
											// quantity → the method parameter passed in.
			} else {
				System.out.println("Cannot remove more than available quantity!");
			}
		}
	}

	// Calculate total dynamically
	public double calculateTotal() {
		return price * quantity;
	}

	// Getters
	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
