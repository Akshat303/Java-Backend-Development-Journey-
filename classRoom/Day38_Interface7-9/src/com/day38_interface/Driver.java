package com.day38_interface;

public class Driver {

	public static void main(String[] args) {
		IBooking booking = new TrainBooking();
		booking.autoUpgrade();

		IBooking flightBooking = new FlightBooking();
		System.out.println("Driver.main()... Flight Booking");
		FlightBooking.printFlightTicket("Ak", "898");

	}

}
