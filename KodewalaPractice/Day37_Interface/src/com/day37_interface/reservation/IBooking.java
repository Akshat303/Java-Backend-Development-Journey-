package com.day37_interface.reservation;

public interface IBooking {
	// Java 7: implicitly public abstract
	Ticket bookTicket(String passenger, int seats);

	boolean cancelTicket(Ticket ticket);
}
