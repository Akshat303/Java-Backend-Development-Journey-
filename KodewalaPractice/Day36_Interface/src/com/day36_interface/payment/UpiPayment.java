package com.day36_interface.payment;

public class UpiPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paid using UPI");
		
	}

}
