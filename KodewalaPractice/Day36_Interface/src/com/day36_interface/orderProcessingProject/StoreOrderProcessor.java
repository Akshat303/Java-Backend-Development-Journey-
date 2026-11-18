package com.day36_interface.orderProcessingProject;

public class StoreOrderProcessor implements OrderProcessor {

	@Override
	public void processOrder(double amount) {

		if (amount <= 0) {
			System.out.println("Store order rejected: Invalid amount.");
			return;
		}

		System.out.println("Store order processed successfully. Amount: Rs. " + amount);
	}
}