package com.day36.interface1.shoppingCheckout;

public class UpiPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of Rs. " + amount + " completed using UPI.");

	}

}
