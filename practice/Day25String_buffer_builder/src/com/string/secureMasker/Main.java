package com.string.secureMasker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SecureMasker masker = new SecureMasker();

		System.out.println("Enter account number:");
		String accountNumber = scanner.nextLine();

		String maskedAccount = masker.maskSensitiveData(accountNumber);
		System.out.println("Account number: " + maskedAccount);

		// Bonus: Reuse for phone numbers or other identifiers
		System.out.println("Enter phone number:");
		String phoneNumber = scanner.nextLine();

		String maskedPhone = masker.maskSensitiveData(phoneNumber);
		System.out.println("Phone number: " + maskedPhone);
	}
}
