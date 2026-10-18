package com.single.vehicle;

//  Parent Class
public class Vechicle {

	private String brand;
	private int speed;

	public Vechicle(String brand, int speed) {
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
		System.out.println("Vehical Started");

	}

}

// Child Class

class Car extends Vechicle {
	private String fuelType;

	public Car(String brand, int speed, String fuelType) {
		super(brand, speed); // Initialized parent
		this.fuelType = fuelType;
	}

	public void displayCarDetails() {
		System.out.println("Brand      : " + getBrand());
		System.out.println("Speed      : " + getSpeed() + " km/h");
		System.out.println("Fuel Type  : " + fuelType);
	}
}
