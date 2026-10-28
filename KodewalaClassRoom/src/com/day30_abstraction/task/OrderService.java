package com.day30_abstraction.task;

public class OrderService {

	public boolean placeOrder(Order order) {

		validateOrder(order);
		checkInventory(order);
		processPayment(order);
		saveOrder(order);
		sendConfirmation(order);

		return true;
	}

	private void validateOrder(Order order) {
		System.out.println("Validating order...");
	}

	private void checkInventory(Order order) {
		System.out.println("Checking inventory...");
	}

	private void processPayment(Order order) {
		System.out.println("Processing payment...");
	}

	private void saveOrder(Order order) {
		System.out.println("Saving order...");
	}

	private void sendConfirmation(Order order) {
		System.out.println("Sending confirmation...");
	}
}
