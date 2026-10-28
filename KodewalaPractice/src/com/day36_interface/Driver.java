package com.day36_interface;

public class Driver {

	public static void main(String[] args) {
//
//		FlightBooking fb = new FlightBooking();
//		int finalFare = fb.calculateDiscount(10000, 20);
//		System.out.println("Final Fare = " + finalFare);

//		fb.calculateDiscountTax(500);
		
		IDiscount discount = new FlightBooking();
		int finalFare = discount.calculateDiscount(1000, 20);
		System.out.println("Final Fare = " + finalFare);
	}
}