package com.practice.vehicle;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String vehicleNumber, String brand, double rentalPricePerDay, int numberOfSeats) {
        super(vehicleNumber, brand, rentalPricePerDay);
        this.numberOfSeats = Math.max(numberOfSeats, 1); // must be positive
    }

    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Number: " + getVehicleNumber());
        System.out.println("Brand: " + getBrand());
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("Price per day: ₹" + getRentalPricePerDay());
        System.out.println("Available: " + isAvailable());
    }
}
