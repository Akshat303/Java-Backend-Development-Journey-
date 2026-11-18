package com.single.orderManagement;

public class Order {

	private final String orderId;
	private final double orderAmount;

	public Order(String orderId, double orderAmount) {
		validateOrderId(orderId);
		validateOrderAmount(orderAmount);

		this.orderId = orderId;
		this.orderAmount = orderAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public double calculateFinalAmount() {
		return orderAmount;
	}

	private static void validateOrderId(String orderId) {
		if (orderId == null || orderId.isBlank()) {
			throw new IllegalArgumentException("Order ID cannot be null or empty");
		}
	}

	private static void validateOrderAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Order amount must be positive");
		}
	}
}