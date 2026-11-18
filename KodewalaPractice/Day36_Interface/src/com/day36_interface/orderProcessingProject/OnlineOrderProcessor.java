package com.day36_interface.orderProcessingProject;

public class OnlineOrderProcessor implements OrderProcessor {

	@Override
	public void processOrder(double amount) {

		if (amount <= 0) {
			System.out.println("Online order rejected: Invalid amount.");
			return;
		}

		System.out.println("Online order processed successfully. Amount: Rs. " + amount);
	}
}