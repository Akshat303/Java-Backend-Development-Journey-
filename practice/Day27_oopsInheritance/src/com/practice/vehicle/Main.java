package com.practice.vehicle;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("KA01AB1234", "Toyota", 2000, 5);
		Bike bike = new Bike("KA02XY5678", "Yamaha", 500, 150);

		car.displayCarDetails();
		bike.displayBikeDetails();

		// Rent car for 3 days
		car.rentVehicle(3); // ₹6000
		// Try renting same car again
		car.rentVehicle(2); // rejected
		car.returnVehicle();

		// Rent bike for 2 days
		bike.rentVehicle(2); // ₹1000
	}
}
