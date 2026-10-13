package com.practice.objectBlock;

public class BankAccount {

	// Static variable shared across all objects
	static String bankName = "SBI Bank";

	// Static block
	static {
		System.out.println("1. Static block");
	}

	// Instance variable with default value
	private String accountHolder = "Unknown";
	private int balance = 0;

	// Instance initialization block
	{
		System.out.println("2. Instance block");
	}

	// Constructor with parameters
	public BankAccount(String accountHolder, int balance) {
		System.out.println("3. Constructor");
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Default constructor
	public BankAccount() {
		System.out.println("Default. Constructor");
	}

	// Display method
	public void display() {
		System.out.println("Bank name: " + bankName);
		System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
	}
}
