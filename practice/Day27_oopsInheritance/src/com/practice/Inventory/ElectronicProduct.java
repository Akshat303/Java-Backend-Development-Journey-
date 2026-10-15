package com.practice.Inventory;

public class ElectronicProduct extends Product {
	private int warrantyInYears;
	private String brand;

	// Constructor
	public ElectronicProduct(String productName, String description, int quantity, double price, int warrantyInYears,
			String brand) {
		super(productName, description, quantity, price);
		this.warrantyInYears = Math.max(warrantyInYears, 0); // prevent negative
		this.brand = brand;
	}

	// Display electronic details
	public void viewElectronicDetails() {
		System.out.println("Electronic Product Details:");
		System.out.println("Name: " + getProductName());
		System.out.println("Description: " + getDescription());
		System.out.println("Brand: " + brand);
		System.out.println("Warranty: " + warrantyInYears + " years");
		System.out.println("Price: ₹" + getPrice());
		System.out.println("Quantity: " + getQuantity());
	}
}
