package com.bank.packages2;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {

		this.balance = initialBalance;
	}

	public void applyTransactions(double[] transaction) {
		for (int i = 0; i < transaction.length; i++) {
			double trans = transaction[i];

			if (trans < 0 && Math.abs(trans) > balance) {
				System.out.println("Transaction " + i + " failed: Insufficient funds for withdrawal of " + trans);
			} else {
				balance += trans;
				System.out.println("Transaction " + i + " applied (" + trans + "). Updated Balance: " + balance);
			}
		}

	}

	public double getBalance() {
		return balance;
	}

}
