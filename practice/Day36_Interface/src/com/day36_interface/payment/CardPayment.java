package com.day36_interface.payment;

public class CardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paid using Card");

	}

}
