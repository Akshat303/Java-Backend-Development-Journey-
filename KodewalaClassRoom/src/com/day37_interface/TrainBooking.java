package com.day37_interface;

public class TrainBooking implements IBooking {

	@Override
	public Booking book() {
		System.out.println("TrainBooking.book()");
		Booking booking = new Booking();

		booking.setBookingId("BK101");
		booking.setStatus("CONFIRMED");
		booking.setPassengerName("Rahul Sharma");
		booking.setSource("Bengaluru");
		booking.setDestination("Chennai");

		booking.setTicketPrice(1500.00);
		booking.setPaymentStatus("PAID");
		booking.setSeatNumber("A12");
		return booking;
	}

	@Override
	public void cancelBooking() {
		// TODO Auto-generated method stub

	}

	@Override
	public Booking checkStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void autoUpgrade() {
		// code to do auto upgrade .. 100 lines
		System.out.println("TrainBooking.autoUpgrade()............");
		
	}

}
