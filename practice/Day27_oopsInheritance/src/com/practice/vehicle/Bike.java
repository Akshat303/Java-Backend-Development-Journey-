package com.practice.vehicle;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String vehicleNumber, String brand, double rentalPricePerDay, int engineCapacity) {
        super(vehicleNumber, brand, rentalPricePerDay);
        this.engineCapacity = Math.max(engineCapacity, 1); // must be positive
    }

    public void displayBikeDetails() {
        System.out.println("Bike Details:");
        System.out.println("Number: " + getVehicleNumber());
        System.out.println("Brand: " + getBrand());
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Price per day: ₹" + getRentalPricePerDay());
        System.out.println("Available: " + isAvailable());
    }
}
