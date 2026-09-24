package com.debug.package1;

public class DriverPaymentService {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();

		paymentService.processPayment("UPI", 1500.0);
		paymentService.processPayment("crypto", 500.0); 
		paymentService.processPayment("CARD", -50.0); // Invalid amount
	}
}
