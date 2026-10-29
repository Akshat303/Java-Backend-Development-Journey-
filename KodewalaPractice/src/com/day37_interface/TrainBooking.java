package com.day37_interface;

public class TrainBooking implements IBooking {

    @Override
    public Booking book(String name, double price) {
        System.out.println("Executing Train Booking...");
        Booking b = new Booking();
        b.setBookingId("TRN-101");
        b.setPassengerName(name);
        b.setTicketPrice(price);
        b.setStatus("CONFIRMED");
        return b;
    }

    @Override
    public void cancelBooking(String bookingId) {
        System.out.println("Train booking with ID " + bookingId + " has been cancelled.");
    }

    @Override
    public void checkStatus(String bookingId) {
        System.out.println("Checking status for Train booking ID: " + bookingId);
    }
}