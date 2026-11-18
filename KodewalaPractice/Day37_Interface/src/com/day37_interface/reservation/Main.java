package com.day37_interface.reservation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Initializing bus service with 10 available seats
		IBooking bookingService = new BusBookingService(10);

		System.out.println("=== Welcome to City Bus Reservation Engine ===");

		// Transaction 1: User attempts booking
		System.out.print("Enter passenger name: ");
		String name = scanner.nextLine();

		System.out.print("Enter number of seats to book: ");
		int seats = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		Ticket firstTicket = bookingService.bookTicket(name, seats);

		System.out.println("\n--- Ticket Information ---");
		System.out.println("Ticket ID     : " + firstTicket.getTicketId());
		System.out.println("Passenger     : " + firstTicket.getPassengerName());
		System.out.println("Seat Count    : " + firstTicket.getSeatCount());
		System.out.println("Total Fare    : INR " + firstTicket.getTotalFare());
		System.out.println("Booking Status: " + firstTicket.getStatus());

		// Transaction 2: Edge Case Test (Overbooking attempt)
		System.out.println("\n--- Testing Edge Case: Second Booking Request ---");
		System.out.print("Enter seats for a second passenger (Kabir): ");
		int secondSeats = scanner.nextInt();
		scanner.nextLine();

		Ticket secondTicket = bookingService.bookTicket("Kabir", secondSeats);
		System.out.println("Second Ticket Status: " + secondTicket.getStatus());

		// Transaction 3: Cancellation test
		if ("CONFIRMED".equals(firstTicket.getStatus())) {
			System.out.print("\nDo you want to cancel the first ticket? (yes/no): ");
			String decision = scanner.nextLine();
			if ("yes".equalsIgnoreCase(decision)) {
				bookingService.cancelTicket(firstTicket);
				System.out.println("Updated First Ticket Status: " + firstTicket.getStatus());
			}
		}

	}
}