package com.day34_oopsRevision.encapsulation;

public class Driver {

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.credit();

		acc1.setBalance(12000);
		acc1.setMobileNo("9876543210");
		System.out.println("Balance = " + acc1.getBalance());
		System.out.println("Mobile no = " + acc1.getMobileNo());

	}

}
