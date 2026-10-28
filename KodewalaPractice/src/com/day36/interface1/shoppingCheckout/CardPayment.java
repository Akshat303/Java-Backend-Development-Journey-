package com.day36.interface1.shoppingCheckout;

public class CardPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of Rs. " + amount + " completed using Card.");

	}

}
