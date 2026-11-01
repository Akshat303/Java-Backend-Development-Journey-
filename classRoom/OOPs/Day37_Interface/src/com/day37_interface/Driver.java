package com.day37_interface;

public class Driver {

	public static void main(String[] args) 
	{
       IBooking booking = new TrainBooking();	
       booking.autoUpgrade();

	}

}
