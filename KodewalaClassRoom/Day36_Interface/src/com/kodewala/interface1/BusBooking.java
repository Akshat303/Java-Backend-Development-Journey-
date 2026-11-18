package com.kodewala.interface1;

public class BusBooking implements IDiscount {
	@Override
	public int calculateDiscount(int amount, int rate) {
//		int finalFare = amount - (amount * rate) / 100;
		return 0;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("BusBooking.calculateDiscountTax()");
	}
}