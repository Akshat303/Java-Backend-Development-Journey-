package com.practice.Inventory;

public class ClothingProduct extends Product {
	private String size;
	private String fabricType;

	// Constructor
	public ClothingProduct(String productName, String description, int quantity, double price, String size,
			String fabricType) {
		super(productName, description, quantity, price);
		this.size = size;
		this.fabricType = fabricType;
	}

	// Display clothing details
	public void viewClothingDetails() {
		System.out.println("Clothing Product Details:");
		System.out.println("Name: " + getProductName());
		System.out.println("Description: " + getDescription());
		System.out.println("Size: " + size);
		System.out.println("Fabric: " + fabricType);
		System.out.println("Price: ₹" + getPrice());
		System.out.println("Quantity: " + getQuantity());
	}
}
