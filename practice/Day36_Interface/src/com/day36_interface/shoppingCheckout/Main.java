package com.day36_interface.shoppingCheckout;

public class Main {

	public static void main(String[] args) {
		Checkout checkout = new Checkout();

		PaymentMethod upi = new UpiPayment();
		checkout.checkout(upi, 1500.0);

		System.out.println();

		PaymentMethod card = new CardPayment();
		checkout.checkout(card, 2500.0);

	}

}
