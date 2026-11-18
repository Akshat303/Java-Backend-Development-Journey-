package com.day37_interface.reservation;

public class Ticket {
	private String ticketId;
	private String passengerName;
	private int seatCount;
	private double totalFare;
	private String status;

	public Ticket() {
	}

	public Ticket(String ticketId, String passengerName, int seatCount, double totalFare, String status) {
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.seatCount = seatCount;
		this.totalFare = totalFare;
		this.status = status;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}