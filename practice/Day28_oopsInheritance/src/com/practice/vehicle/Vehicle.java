package com.practice.vehicle;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private double rentalPricePerDay;
	private boolean available;

	// Constructor
	public Vehicle(String vehicleNumber, String brand, double rentalPricePerDay) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.rentalPricePerDay = Math.max(rentalPricePerDay, 0);
		this.available = true; // default: available
	}

	// Getters
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getBrand() {
		return brand;
	}

	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public boolean isAvailable() {
		return available;
	}

	// Controlled availability methods
	public boolean rentVehicle(int days) {
		if (available && days > 0) {
			available = false;
			double totalCost = rentalPricePerDay * days;
			System.out.println("✅ Vehicle rented for " + days + " days. Total cost: ₹" + totalCost);
			return true;
		}
		System.out.println("❌ Vehicle not available for rent.");
		return false;
	}

	public void returnVehicle() {
		available = true;
		System.out.println("✅ Vehicle returned and is now available.");
	}
}
