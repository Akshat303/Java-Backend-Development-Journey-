package com.day38_practiceOOPs.delivery;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		DeliveryFeeCalculator calculator = new DeliveryFeeCalculator();

		System.out.println("========== DELIVERY FEE BREAKDOWN ==========\n");

		// Case 1: Standard order (Only Distance) -> invokes calculateFee(double)
		double regularDistance = 5.5;
		BigDecimal standardFee = calculator.calculateFee(regularDistance);
		System.out.printf("Case 1 [Standard - %.1f km]          : ₹%.2f%n", regularDistance, standardFee);

		// Case 2: Rush hour order -> invokes calculateFee(double, boolean)
		double rushDistance = 7.0;
		BigDecimal rushHourFee = calculator.calculateFee(rushDistance, true);
		System.out.printf("Case 2 [Peak Hour - %.1f km]         : ₹%.2f%n", rushDistance, rushHourFee);

		// Case 3: Festival discount order -> invokes calculateFee(double, boolean,
		// BigDecimal)
		double festivalDistance = 12.0;
		BigDecimal festivalDiscount = new BigDecimal("40.00");
		BigDecimal festivalFee = calculator.calculateFee(festivalDistance, true, festivalDiscount);
		System.out.printf("Case 3 [Peak + Festival Off - %.1f km]: ₹%.2f%n", festivalDistance, festivalFee);

		// Case 4: Exception verification (Negative distance check)
		System.out.println("\nTesting Negative Distance Exception Handling:");
		try {
			calculator.calculateFee(-3.5);
		} catch (IllegalArgumentException ex) {
			System.err.println("Expected Validation Caught: " + ex.getMessage());
		}

		System.out.println("\n============================================");
	}
}