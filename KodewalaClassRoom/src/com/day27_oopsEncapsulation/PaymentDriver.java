package com.day27_oopsEncapsulation;

public class PaymentDriver {

	public static void main(String[] args) {

		Payment user1 = new Payment(1000);
		user1.doCredit(200);
		
//		Payment.balance=506;

		System.out.println(user1.getBalance());
		
		user1.doDebit(1300);
		System.out.println("your balance "+user1.getBalance());

	}

}
