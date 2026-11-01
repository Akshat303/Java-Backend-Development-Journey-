package com.day38_practiceOOPs.bank;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		// Wiring dependencies (Composition Root)
		AccountRepository repository = new InMemoryAccountRepository();
		NotificationService notificationService = new ConsoleNotificationService();
		BankingService bankingService = new BankingService(repository, notificationService);

		// Account create & persist
		BankAccount myAccount = new BankAccount("AC987654", "Akshat", new BigDecimal("5000.00"));
		repository.save(myAccount);

		System.out.println("=== Initial State ===");
		System.out.println("Holder: " + myAccount.getHolderName());
		System.out.println("Account: " + myAccount.getAccountNumber());
		System.out.println("Balance: ₹" + myAccount.getBalance());
		System.out.println("=====================");

		// 1. Valid Deposit
		bankingService.deposit("AC987654", new BigDecimal("2500.00"));

		// 2. Valid Withdrawal
		bankingService.withdraw("AC987654", new BigDecimal("1200.00"));

		// 3. Exception Case: Negative deposit attempt
		try {
			System.out.println("\nTesting Negative Deposit (-500)...");
			bankingService.deposit("AC987654", new BigDecimal("-500.00"));
		} catch (IllegalArgumentException ex) {
			System.err.println("Caught Expected Error: " + ex.getMessage());
		}

		// 4. Exception Case: Overdraw attempt
		try {
			System.out.println("\nTesting Overdraw (₹20,000)...");
			bankingService.withdraw("AC987654", new BigDecimal("20000.00"));
		} catch (IllegalStateException ex) {
			System.err.println("Caught Expected Error: " + ex.getMessage());
		}
	}
}