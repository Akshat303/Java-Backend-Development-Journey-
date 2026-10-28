package com.day36_interface.orderProcessingProject;

public class MobileOrderProcessor implements OrderProcessor {

	@Override
	public void processOrder(double amount) {

		if (amount <= 0) {
			System.out.println("Mobile order rejected: Invalid amount.");
			return;
		}

		System.out.println("Mobile order processed successfully. Amount: Rs. " + amount);
	}
}