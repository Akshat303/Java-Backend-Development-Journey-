package com.day37_interface.dynamicDelivery;

public interface DeliveryPartner {
	// Java 7: implicitly public abstract
	double calculateCharge(double distanceKm, double weightKg);

	int getEstimatedDeliveryMinutes(double distanceKm);
}