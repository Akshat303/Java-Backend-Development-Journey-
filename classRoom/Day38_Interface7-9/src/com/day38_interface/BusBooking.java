package com.day38_interface;

/**
 * This class is implementing IBooking interface and must implement all the
 * abstract method of IBooking interface.(100% contract)
 */
public class BusBooking implements IBooking {

	@Override
	public Booking book() {
		System.out.println("BusBooking.book()");
		return null;
	}

	@Override
	public void cancelBooking() {
		System.out.println("BusBooking.cancelBooking()");
	}

	@Override
	public Booking checkStatus() {
		Booking booking = new Booking();
		booking.setBookingId("MMTBB256");
		booking.setStatus("CONFIRMED");
		return booking;
	}

	@Override
	public SearchResult search() {
		SearchResult result = new SearchResult();
		return result;
	}

}
