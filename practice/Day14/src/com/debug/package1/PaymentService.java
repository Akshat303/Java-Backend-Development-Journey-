package com.debug.package1;

public class PaymentService {

	public void processPayment(String method, double amount) {
		System.out.println("processPayment() called with method: " + method + ", amount: " + amount);

		if (amount <= 0) {
			System.out.println("Error: Invalid transaction amount.");
			return;
		}

		if ("UPI".equalsIgnoreCase(method)) {
			payViaUPI(amount);
		} else if ("CARD".equalsIgnoreCase(method)) {
			payViaCard(amount);
		} else if ("NETBANKING".equalsIgnoreCase(method)) {
			payViaNetBanking(amount);
		} else {
			System.out.println("Error: Unsupported payment method -> " + method);
		}
	}

	private void payViaUPI(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
	}

	private void payViaCard(double amount) {
		System.out.println("Validating card details...");
		System.out.println("Processing Card payment of ₹" + amount);
	}

	private void payViaNetBanking(double amount) {
		System.out.println("Redirecting to bank gateway...");
		System.out.println("Processing Net Banking payment of ₹" + amount);
	}
}