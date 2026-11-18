package com.practice.objectBlock;

public class ApplicationServiceDriver {

	public static void main(String[] args) {
		System.out.println("Main method started");

		// Create services
		ApplicationService s1 = new ApplicationService("UserService");
		ApplicationService s2 = new ApplicationService("PaymentService");
		ApplicationService s3 = new ApplicationService("OrderService");

		// Display details
		s1.displayService();
		s2.displayService();
		s3.displayService();

		// Show total services
		ApplicationService.displayTotalServices();
	}
}
