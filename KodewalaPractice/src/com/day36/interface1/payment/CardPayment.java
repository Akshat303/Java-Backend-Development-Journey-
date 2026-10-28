package com.day36.interface1.payment;

public class CardPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paid using Card");

	}

}
