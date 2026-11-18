package com.string.finalPractice;

//Declared final: cannot be extended
public final class SecurePayment {

	private double amount;

	// Constructor
	public SecurePayment(double amount) {
		this.amount = amount;
	}

	// Process payment
	public void processPayment() {
		System.out.println("Processing secure payment of ₹" + amount);
	}

	// Getter
	public double getAmount() {
		return amount;
	}
}
