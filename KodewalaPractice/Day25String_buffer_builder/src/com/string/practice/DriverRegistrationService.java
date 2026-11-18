package com.string.practice;

import java.util.Scanner;

public class DriverRegistrationService {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RegistrationService service = new RegistrationService();

		System.out.println("Enter username:");
		String username = scanner.nextLine();

		if (!service.validateUsername(username)) {
			System.out.println("Invalid username. Registration failed.");
			return;
		}

		System.out.println("Enter display name:");
		String displayName = scanner.nextLine();
		String normalizedDisplayName = service.normalizeDisplayName(displayName);

		String registrationMessage = service.buildRegistrationMessage(username, normalizedDisplayName);
		String auditMessage = service.buildAuditMessage(username);

		System.out.println(registrationMessage);
		System.out.println(auditMessage);

		// Intern investigation
		service.investigateIntern(username);
	}
}
