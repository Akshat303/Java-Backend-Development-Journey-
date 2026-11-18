package com.practice.bank;

public class BankAccount {

	private String accountHolder;
	private String accountType;
	private double balance;

	private static int totalAccounts;

	public BankAccount(String _accountHolder, String _accountType, double _balance) {

		this.accountHolder = _accountHolder;
		this.accountType = _accountType;
		this.balance = _balance;

		totalAccounts++;
	}

	public void deposit(double amount) {

		if (amount <= 0) {

			System.out.println("Invalid amount");

		} else {

			balance = balance + amount;

			System.out.println("Amount deposited successfully");
			System.out.println("Deposited amount: " + amount);
			System.out.println("New balance: " + balance);
		}
	}

	public void withdraw(double amount) {

		System.out.println("Before withdrawal:");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Amount: " + amount);
		System.out.println("Balance: " + balance);

		if (amount <= 0) {

			System.out.println("Invalid amount");

		} else if (amount > balance) {

			System.out.println("Insufficient balance");

		} else {

			balance = balance - amount;

			System.out.println("Amount withdrawn successfully");
		}

		System.out.println("After withdrawal:");
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Amount: " + amount);
		System.out.println("Balance: " + balance);
	}

	public void checkBalance() {

		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Account Type: " + accountType);
		System.out.println("Current Balance: " + balance);
	}

	public void accountService() {

		switch (accountType.toUpperCase()) {

		case "SAVINGS":
			System.out.println("Interest applicable");
			break;

		case "CURRENT":
			System.out.println("Business transaction account");
			break;

		case "SALARY":
			System.out.println("Salary account");
			break;

		default:
			System.out.println("Invalid account type");
		}
	}

	public static void showTotalAccounts() {

		System.out.println("Total Accounts: " + totalAccounts);
	}
}