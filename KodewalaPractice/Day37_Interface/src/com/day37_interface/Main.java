package com.day37_interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();

        // Interface reference pointing to implementation object
        IBooking service = new TrainBooking();
        
        Booking myBooking = service.book(name, price);
        
        System.out.println("----- Booking Details -----");
        System.out.println("Booking ID: " + myBooking.getBookingId());
        System.out.println("Passenger: " + myBooking.getPassengerName());
        System.out.println("Status: " + myBooking.getStatus());
        System.out.println("Fare: INR " + myBooking.getTicketPrice());
        
        service.cancelBooking(myBooking.getBookingId());
    }
}