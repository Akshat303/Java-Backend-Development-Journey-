package com.order.package1;

public class OrderProcessing {

	public void placeOrder(String item, int quantity, double unitPrice) {
		System.out.println("1. Starting order placement for: " + item);

		boolean inStock = checkInventory(item, quantity);
		if (!inStock) {
			System.out.println("Order cancelled: Out of stock.");
			return;
		}

		double total = calculateTotal(quantity, unitPrice);
		dispatchOrder(item, total);
		System.out.println("4. Order placement finished successfully.");
	}

	private boolean checkInventory(String item, int quantity) {
		System.out.println("2. Checking warehouse stock for " + quantity + " units of " + item);
		return quantity <= 10; // Fails if ordering more than 10
	}

	private double calculateTotal(int quantity, double unitPrice) {
		double subtotal = quantity * unitPrice;
		double tax = subtotal * 0.18;
		return subtotal + tax;
	}

	private void dispatchOrder(String item, double finalAmount) {
		System.out.println("3. Packaging " + item + " | Total Billed: ₹" + finalAmount);
	}
}