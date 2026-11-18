package com.practice.shopping;

public class Customer {
	private int customerId;
	private String customerName;
	private double purchaseAmount;

	public Customer(int customerId, String customerName, double purchaseAmount) {
		this.customerId = customerId;
		this.customerName = validateName(customerName);
		this.purchaseAmount = validateAmount(purchaseAmount);
	}

	private String validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Customer name cannot be empty.");
		}
		return name;
	}

	private double validateAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Purchase amount must be positive.");
		}
		return amount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getPurchaseAmount() {
		return purchaseAmount;
	}

	// Controlled method to update purchases
	public void updatePurchase(double newAmount) {
		this.purchaseAmount = validateAmount(newAmount);
	}

	// To be overridden by child classes
	public double calculateDiscount() {
		return 0;
	}

	public double calculateFinalBill() {
		return purchaseAmount - calculateDiscount();
	}

	public void displayDetails() {
		System.out.println("Customer ID: " + customerId);
		System.out.println("Name: " + customerName);
		System.out.println("Purchase Amount: ₹" + purchaseAmount);
		System.out.println("Discount: ₹" + calculateDiscount());
		System.out.println("Final Bill: ₹" + calculateFinalBill());
	}
}
