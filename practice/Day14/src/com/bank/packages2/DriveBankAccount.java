package com.bank.packages2;

public class DriveBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		double[] transactions = { 250.0, -400.0, -1200.0, 150.0 };

		account.applyTransactions(transactions);
		System.out.println("Final Account Balance: " + account.getBalance());
	}
}