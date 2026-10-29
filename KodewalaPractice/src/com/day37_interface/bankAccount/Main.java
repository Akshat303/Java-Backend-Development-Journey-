package com.day37_interface.bankAccount;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		String accNo = scanner.nextLine();

		System.out.print("Enter Account Holder Name: ");
		String name = scanner.nextLine();

		System.out.print("Enter Opening Deposit: ");
		double initialAmount = scanner.nextDouble();

		SavingsAccount account = new SavingsAccount(accNo, name, initialAmount);

		// Demonstrating Interface Polymorphism
		// Reference 1: Transactional capability
		Transactional transService = account;

		// Reference 2: Audit capability
		Auditable auditService = account;

		System.out.println("\n--- Performing Transactions ---");

		// Transaction 1: Successful deposit
		transService.deposit(2000.0);

		// Transaction 2: Invalid withdrawal breaching min balance
		transService.withdraw(2500.0);

		// Transaction 3: Valid withdrawal
		transService.withdraw(1000.0);

		// Transaction 4: Push past 3 records to test rolling array shift
		transService.deposit(500.0);

		// Audit check via Auditable reference
		auditService.generateMiniStatement();

		scanner.close();
	}
}