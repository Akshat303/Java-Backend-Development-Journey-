package com.single.vehicle;

public class MainVehiclevalidation {


	    public static void main(String[] args) {
	        try {
	            Car2 car = new Car2("Toyota", 120, "Petrol");

	            car.start();
	            car.displayCarDetails();

	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


