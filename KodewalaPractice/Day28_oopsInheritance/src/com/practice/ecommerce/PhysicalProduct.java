package com.practice.ecommerce;

public class PhysicalProduct extends Product {
	private double weightInKg;
	private double shippingCharge;

	public PhysicalProduct(String productId, String name, double price, double weightInKg, double shippingCharge) {
		super(productId, name, price);
		this.weightInKg = validatePositive(weightInKg, "Weight must be positive.");
		this.shippingCharge = Math.max(shippingCharge, 0);
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
		return (getPrice() * quantity) + shippingCharge;
	}

	public void displayDetails() {
		System.out.println("Physical Product: " + getName() + " | Price: ₹" + getPrice() + " | Weight: " + weightInKg
				+ "kg | Shipping: ₹" + shippingCharge);
	}
}
