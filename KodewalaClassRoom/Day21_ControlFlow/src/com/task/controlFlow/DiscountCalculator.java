package com.task.controlFlow;

public class DiscountCalculator {

	private String customerType;
	private double purchaseAmount;

	public DiscountCalculator(String _customerType, double _purchaseAmount) {
		this.customerType = _customerType;
		this.purchaseAmount = _purchaseAmount;
	}

	public double calculateDiscount() {

		double discountPercent = 0;
		double discountAmount = 0;

		// Minimum purchase condition
		if (purchaseAmount > 1000) {

			switch (customerType.toLowerCase()) {

			case "gold":
				discountPercent = 20;
				break;

			case "silver":
				discountPercent = 10;
				break;

			case "regular":
				discountPercent = 5;
				break;

			default:
				System.out.println("Invalid customer type.");
				break;
			}

			// Calculate discount
			discountAmount = purchaseAmount * discountPercent / 100;

			// Maximum discount condition
			if (discountAmount > 2500) {
				discountAmount = 2500;
			}

		} else {
			System.out.println("Minimum purchase should be above 1000.");
		}

		return discountAmount;
	}
}