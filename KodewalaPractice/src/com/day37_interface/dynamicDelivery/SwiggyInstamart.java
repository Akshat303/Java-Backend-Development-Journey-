package com.day37_interface.dynamicDelivery;

public class SwiggyInstamart implements DeliveryPartner {
	private static final double MAX_WEIGHT_KG = 15.0;
	private static final double RATE_PER_KM = 10.0;
	private static final double RATE_PER_KG = 5.0;
	private static final int BASE_PREP_TIME_MINUTES = 10;
	private static final int TIME_PER_KM_MINUTES = 4;

	@Override
	public double calculateCharge(double distanceKm, double weightKg) {
		if (distanceKm <= 0 || weightKg <= 0) {
			System.out.println("Error: Distance and weight must be positive numbers.");
			return -1.0;
		}

		if (weightKg > MAX_WEIGHT_KG) {
			System.out.println("Rejected: Swiggy Instamart allows a maximum weight of " + MAX_WEIGHT_KG + " kg.");
			return -1.0;
		}

		return (distanceKm * RATE_PER_KM) + (weightKg * RATE_PER_KG);
	}

	@Override
	public int getEstimatedDeliveryMinutes(double distanceKm) {
		if (distanceKm <= 0) {
			return -1;
		}
		return BASE_PREP_TIME_MINUTES + (int) Math.round(distanceKm * TIME_PER_KM_MINUTES);
	}
}