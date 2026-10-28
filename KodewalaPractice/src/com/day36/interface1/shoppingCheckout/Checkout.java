package com.day36.interface1.shoppingCheckout;

public class Checkout {
	public void checkout(PaymentMethod paymentMethod, double amount) {

		System.out.println("Processing checkout...");

		paymentMethod.pay(amount);

		System.out.println("Checkout completed.");

	}
}
