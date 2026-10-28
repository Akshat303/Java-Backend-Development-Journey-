package com.day36_interface.shoppingCheckout;

public class UpiPayment implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Payment of Rs. " + amount + " completed using UPI.");

	}

}
