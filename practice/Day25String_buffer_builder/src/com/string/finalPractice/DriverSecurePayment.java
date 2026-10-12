package com.string.finalPractice;

//Attempting to extend SecurePayment will cause a compiler error
//class UPIPayment extends SecurePayment { } // ❌ Not allowed

//Composition-based class
class PaymentService {
	private SecurePayment securePayment;

	public PaymentService(SecurePayment securePayment) {
		this.securePayment = securePayment;
	}

	public void executePayment() {
		System.out.println("Payment Service executing...");
		securePayment.processPayment(); // Delegation
	}
}

public class DriverSecurePayment {
	public static void main(String[] args) {
		// Create a final class object
		SecurePayment payment = new SecurePayment(2500.0);

		// Use composition
		PaymentService service = new PaymentService(payment);
		service.executePayment();
	}
}
