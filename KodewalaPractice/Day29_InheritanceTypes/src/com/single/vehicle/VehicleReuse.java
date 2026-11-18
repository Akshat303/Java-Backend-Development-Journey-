package com.single.vehicle;

class Vehicle {
	private String brand;
	private int speed;

	public Vehicle(String brand, int speed) {
		validateBrand(brand);
		validateSpeed(speed);

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

	// Reusable validation methods
	protected static void validateBrand(String brand) {
		if (brand == null || brand.trim().isEmpty()) {
			throw new IllegalArgumentException("Brand cannot be empty");
		}
	}

	protected static void validateSpeed(int speed) {
		if (speed < 0 || speed > 300) {
			throw new IllegalArgumentException("Speed must be between 0 and 300 km/h");
		}
	}
}

class Car3 extends Vehicle {
	private String fuelType;

	public Car3(String brand, int speed, String fuelType) {
		super(brand, speed);

		validateFuelType(fuelType);
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

	// Reusable validation method
	private static void validateFuelType(String fuelType) {
		if (fuelType == null || fuelType.trim().isEmpty()) {
			throw new IllegalArgumentException("Fuel type cannot be empty");
		}

		String fuel = fuelType.trim().toLowerCase();

		if (!fuel.equals("petrol") && !fuel.equals("diesel") && !fuel.equals("electric") && !fuel.equals("cng")) {
			throw new IllegalArgumentException("Invalid fuel type. Allowed: Petrol, Diesel, Electric, CNG");
		}
	}
}

public class VehicleReuse {
	public static void main(String[] args) {
		Car car = new Car("Toyota", 120, "Petrol");

		car.start();
		car.displayCarDetails();
	}
}