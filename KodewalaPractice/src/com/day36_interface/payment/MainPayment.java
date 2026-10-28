package com.day36_interface.payment;

public class MainPayment {
	public static void main(String[] args) {
		Payment payment;

		payment = new UpiPayment();
		payment.pay();

		payment = new CardPayment();
		payment.pay();
	}

}
