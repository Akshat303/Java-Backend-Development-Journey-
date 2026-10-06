package com.practice.shoppingCart;

public class ShoppingCart {

	private double[] prices;

	public ShoppingCart(double[] prices) {
		this.prices = prices;
	}

	public double calculateFinalAmount() {

		double total = 0;

		for (int i = 0; i < prices.length; i++) {
			total += prices[i];
		}

		double discount = 0;

		if (total >= 5000) {
			discount = total * 15 / 100;
		} else if (total >= 3000) {
			discount = total * 10 / 100;
		}

		double finalAmount = total - discount;

		if (finalAmount < 3000) {
			finalAmount += 100;
		}

		return finalAmount;
	}
}