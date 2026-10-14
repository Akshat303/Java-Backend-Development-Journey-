package com.kodewala.task;

public class FundTransfer {

	private String accountHolderName;
	private String accountNumber;
	private double balance;

	public FundTransfer(String _accountHolderName, String _accountNumber, double _balance) {
		super();
		this.accountHolderName = _accountHolderName;
		this.accountNumber = _accountNumber;
		this.balance = _balance;
	}

	public void reciveFund(int amount) {
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Enter valid positive amount ");
		}

	}

	public void sendFund(int amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("your balance is low " + balance);
		}

	}

	public double getBalance() {
		return balance;
	}

}
