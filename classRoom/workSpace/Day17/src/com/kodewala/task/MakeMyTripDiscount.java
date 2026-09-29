package com.kodewala.task;

public class MakeMyTripDiscount {
	public String discountPackage(float fare) {
		if (fare < 5000) {
			System.out.println("Sorry you have No Distount");
		} else if (fare >= 5000 && fare < 10000) {
			discountCal(fare);
		} else if (fare >= 10000) {
			discountCal(fare);
		} else {
			System.out.println("No distount");
		}
		return null;
	}

	public void discountCal(double price) {
		float disCal;
		if (price >= 5000 && price < 10000) {
			disCal = (float) (price - (price * 0.10));
			System.out.println("Discount 10% of total " + price + "\n Your final Price is " + disCal);
		} else if (price >= 10000) {
			disCal = (float) (price - 1250);
			System.out.println("Discount 10% of total " + price + "\n Your final Price is " + disCal);
		}

	}
}
