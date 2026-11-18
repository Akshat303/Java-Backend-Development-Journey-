package com.day37_interface.dynamicDelivery;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select Delivery Partner:");
		System.out.println("1. Swiggy Instamart");
		System.out.println("2. Dunzo Delivery");
		System.out.print("Enter choice (1 or 2): ");
		int choice = scanner.nextInt();

		DeliveryPartner partner = null;

		if (choice == 1) {
			partner = new SwiggyInstamart();
		} else if (choice == 2) {
			partner = new DunzoDelivery();
		} else {
			System.out.println("Invalid selection. Exiting.");
			scanner.close();
			return;
		}

		System.out.print("Enter delivery distance (in km): ");
		double distance = scanner.nextDouble();

		System.out.print("Enter package weight (in kg): ");
		double weight = scanner.nextDouble();

		// Polymorphic method calls
		double charge = partner.calculateCharge(distance, weight);

		if (charge != -1.0) {
			int eta = partner.getEstimatedDeliveryMinutes(distance);
			System.out.println("--- Delivery Summary ---");
			System.out.println("Status: Accepted");
			System.out.println("Total Delivery Fee: INR " + charge);
			System.out.println("Estimated Time of Arrival: " + eta + " mins");
		} else {
			System.out.println("--- Delivery Summary ---");
			System.out.println("Status: Delivery could not be scheduled.");
		}

	}
}