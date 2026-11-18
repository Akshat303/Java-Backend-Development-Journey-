package com.day34_oopsRevision.abstraction;

public class Account {

	private int balance;

	public void cradit() {
//		200 lines of code 
		
//		check Balance
		checkBalance();
		
//		CheckPin
		validatePin("ak123");
		
		System.out.println("Account.cradit().....doing fund transfer");
	}

	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}

	private boolean validatePin(String userPin) {
		return true;
	}

}
