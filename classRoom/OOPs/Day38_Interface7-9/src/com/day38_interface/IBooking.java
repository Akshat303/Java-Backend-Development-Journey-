package com.day38_interface;

/**
 * in 2010 - MMT
 */
public interface IBooking {
	// what to do.?
	public abstract Booking book();

	public abstract void cancelBooking();

	public abstract Booking checkStatus();

	SearchResult search();

	// optional -- 2020
	public default void autoUpgrade() // to some of the classes
	{
		System.out.println("IBooking.autoUpgrade()..............");
	}

	// Optional - 2020
	public default void sendNotification() {

		// 200 lines of code (connecting with database(25 lines),get user details and
		// send notification )

		connectToDB();

		System.out.println("Booking.sendNotification()............");
	}

	private void connectToDB() {
		System.out.println("IBooking.connectToDB()...Database Connected...");
	}

	// Common or utility me
	public static void printTicket(String path, String contents) {
		// 200 line of code --> Printing ticket
		System.out.println("IBooking.printTicket() .. static method");
	}
}
