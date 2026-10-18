package com.practice.ecommerce;

public class DigitalProduct extends Product {
	private double fileSizeInMB;
	private int downloadLimit;

	public DigitalProduct(String productId, String name, double price, double fileSizeInMB, int downloadLimit) {
		super(productId, name, price);
		this.fileSizeInMB = validatePositive(fileSizeInMB, "File size must be positive.");
		this.downloadLimit = Math.max(downloadLimit, 1);
	}

	private double validatePositive(double value, String message) {
		if (value <= 0)
			throw new IllegalArgumentException(message);
		return value;
	}

	@Override
	public double calculateTotalCost(int quantity) {
		if (quantity <= 0)
			throw new IllegalArgumentException("Quantity must be positive.");
		return getPrice() * quantity; // no shipping
	}

	public void displayDetails() {
		System.out.println("Digital Product: " + getName() + " | Price: ₹" + getPrice() + " | File Size: "
				+ fileSizeInMB + "MB | Download Limit: " + downloadLimit);
	}
}
