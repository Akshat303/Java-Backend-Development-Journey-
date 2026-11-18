package com.day37_interface;

public interface IBooking {
    // Method signature only - no body in Java 7
    Booking book(String name, double price);
    void cancelBooking(String bookingId);
    void checkStatus(String bookingId);
}