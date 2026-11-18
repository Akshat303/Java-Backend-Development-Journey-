package com.day37_interface.reservation;

public class BusBookingService implements IBooking {
	private static final double FARE_PER_SEAT = 450.0;
	private static int idCounter = 101;

	private int availableSeats;

	public BusBookingService(int totalSeats) {
		this.availableSeats = totalSeats;
	}

	@Override
	public Ticket bookTicket(String passenger, int seats) {
		Ticket ticket = new Ticket();
		ticket.setPassengerName(passenger);
		ticket.setSeatCount(seats);

		// Validation for invalid seat counts
		if (seats <= 0) {
			System.out.println("Booking Error: Seats requested must be at least 1.");
			ticket.setStatus("FAILED");
			ticket.setTicketId("N/A");
			ticket.setTotalFare(0.0);
			return ticket;
		}

		// Check seat availability
		if (seats > availableSeats) {
			System.out.println(
					"Booking Error: Requested " + seats + " seats, but only " + availableSeats + " seats available.");
			ticket.setStatus("FAILED");
			ticket.setTicketId("N/A");
			ticket.setTotalFare(0.0);
			return ticket;
		}

		// Allocate seats and deduct inventory
		availableSeats -= seats;
		String generatedId = "BUS-" + idCounter++;
		double calculatedFare = seats * FARE_PER_SEAT;

		ticket.setTicketId(generatedId);
		ticket.setTotalFare(calculatedFare);
		ticket.setStatus("CONFIRMED");

		System.out.println("Success: Reserved " + seats + " seat(s) under " + generatedId + ". Remaining seats: "
				+ availableSeats);
		return ticket;
	}

	@Override
	public boolean cancelTicket(Ticket ticket) {
		if (ticket == null || !"CONFIRMED".equalsIgnoreCase(ticket.getStatus())) {
			System.out.println("Cancellation Failed: Invalid ticket or ticket not confirmed.");
			return false;
		}

		// Return seats to pool
		availableSeats += ticket.getSeatCount();
		ticket.setStatus("CANCELLED");
		System.out.println("Success: Ticket " + ticket.getTicketId() + " cancelled. Seats returned: "
				+ ticket.getSeatCount() + ". Total available seats now: " + availableSeats);
		return true;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
}