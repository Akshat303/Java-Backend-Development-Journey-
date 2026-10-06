package com.practice.parkingFee;

import java.util.Scanner;

public class ParkingFeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter vehicle type (Bike/Car/Truck): ");
		String vehicleType = sc.nextLine();

		System.out.print("Enter parking hours: ");
		float hours = sc.nextFloat();

		ParkingFee parking = new ParkingFee(vehicleType, hours);

		float fee = parking.calculateFee();

		if (fee == -1) {
			System.out.println("Invalid vehicle type or parking hours.");
		} else {
			System.out.println("Vehicle Type: " + vehicleType);
			System.out.println("Parking Hours: " + hours);
			System.out.println("Parking Fee: ₹" + fee);
		}

		sc.close();
	}
}