package com.practice.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account holder name: ");
		String accountHolder = sc.nextLine();

		System.out.print("Enter account type (SAVINGS/CURRENT/SALARY): ");
		String accountType = sc.nextLine();

		System.out.print("Enter initial balance: ");
		double balance = sc.nextDouble();

		BankAccount account = new BankAccount(accountHolder, accountType, balance);

		int choice = 0;

		while (choice != 5) {

			System.out.println("\n===== BANK MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Account Service");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();

				account.deposit(depositAmount);

				break;

			case 2:

				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = sc.nextDouble();

				account.withdraw(withdrawAmount);

				break;

			case 3:

				account.checkBalance();

				break;

			case 4:

				account.accountService();

				break;

			case 5:

				System.out.println("Thank you for using banking system.");

				break;

			default:

				System.out.println("Invalid choice");
			}
		}

		BankAccount.showTotalAccounts();

		sc.close();
	}
}