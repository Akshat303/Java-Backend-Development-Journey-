package com.day37_interface.dynamicDelivery;

public class DunzoDelivery implements DeliveryPartner {
	private static final double MAX_DISTANCE_KM = 30.0;
	private static final double BASE_FARE = 40.0;
	private static final double RATE_PER_KM = 12.0;
	private static final int TIME_PER_KM_MINUTES = 5;

	@Override
	public double calculateCharge(double distanceKm, double weightKg) {
		if (distanceKm <= 0 || weightKg <= 0) {
			System.out.println("Error: Distance and weight must be positive numbers.");
			return -1.0;
		}

		if (distanceKm > MAX_DISTANCE_KM) {
			System.out.println("Rejected: Dunzo Delivery operates only up to " + MAX_DISTANCE_KM + " km.");
			return -1.0;
		}

		return BASE_FARE + (distanceKm * RATE_PER_KM);
	}

	@Override
	public int getEstimatedDeliveryMinutes(double distanceKm) {
		if (distanceKm <= 0) {
			return -1;
		}
		return (int) Math.round(distanceKm * TIME_PER_KM_MINUTES);
	}
}