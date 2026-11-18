package com.single.vehicle;

public class Vehiclevalidation {

	private String brand;
	private int speed;

	public Vehiclevalidation(String brand, int speed) {
		if (brand == null || brand.trim().isEmpty()) {
			throw new IllegalArgumentException("Brand cannot be empty");
		}

		if (speed < 0 || speed > 300) {
			throw new IllegalArgumentException("Speed must be between 0 and 300 km/h");
		}

		this.brand = brand;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public int getSpeed() {
		return speed;
	}

	public void start() {
		System.out.println("Vehicle started");
	}
}

class Car2 extends Vehiclevalidation {
	private String fuelType;

	public Car2(String brand, int speed, String fuelType) {
		super(brand, speed);

		if (fuelType == null || fuelType.trim().isEmpty()) {
			throw new IllegalArgumentException("Fuel type cannot be empty");
		}

		if (!fuelType.equalsIgnoreCase("Petrol") && !fuelType.equalsIgnoreCase("Diesel")
				&& !fuelType.equalsIgnoreCase("Electric") && !fuelType.equalsIgnoreCase("CNG")) {
			throw new IllegalArgumentException("Invalid fuel type. Allowed: Petrol, Diesel, Electric, CNG");
		}

		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void displayCarDetails() {
		System.out.println("Brand      : " + getBrand());
		System.out.println("Speed      : " + getSpeed() + " km/h");
		System.out.println("Fuel Type  : " + fuelType);
	}
}