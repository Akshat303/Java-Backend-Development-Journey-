package com.day36_interface.shoppingCheckout;

public class Checkout {
	public void checkout(PaymentMethod paymentMethod, double amount) {

		System.out.println("Processing checkout...");

		paymentMethod.pay(amount);

		System.out.println("Checkout completed.");

	}
}
