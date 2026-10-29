package com.day37_interface.cloudStorage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Interface reference pointing to implementation object
		StorageService driveService = new GoogleDriveService();

		System.out.println("=== Google Drive Cloud Storage (15 GB Total) ===");
		System.out.println("Initial Space: " + driveService.getRemainingSpace() + " MB\n");

		boolean keepUploading = true;

		while (keepUploading) {
			System.out.print("Enter file name (e.g., project_backup.zip): ");
			String fileName = scanner.nextLine();

			System.out.print("Enter file size in MB: ");
			double fileSize = scanner.nextDouble();
			scanner.nextLine(); // consume newline character

			// Upload via interface contract
			driveService.upload(fileName, fileSize);

			System.out.print("\nDo you want to upload another file? (yes/no): ");
			String choice = scanner.nextLine();
			if (!"yes".equalsIgnoreCase(choice)) {
				keepUploading = false;
			}
			System.out.println();
		}

		System.out.println("Session Ended. Final Available Storage: " + driveService.getRemainingSpace() + " MB.");

	}
}