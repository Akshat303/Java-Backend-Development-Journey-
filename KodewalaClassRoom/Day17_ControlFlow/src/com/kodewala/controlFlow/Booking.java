package com.kodewala.controlFlow;

public class Booking {
	
	public String doBooking(String from, String to,int noOfPax) {
		String pnr = null;
		if(noOfPax > 6) {
			System.out.println("Need only 6");
		}else {
			pnr = "2336589";
			System.out.println("PNR No. " + pnr);
		}
		return pnr;
	}

}
