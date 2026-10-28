package com.day27_oopsEncapsulation;

public class Payment {

	private int balance;

	public Payment(int _balance) {
		super();
		this.balance = _balance;
	}

	// Setter 
	public void doDebit(int amount) {
		//Modifying the data
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Do not Debit more than " + balance);
		}
	}

	public void doCredit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		}
	}
	
	//Getter
	public int getBalance() {
		return balance;
	}

}
