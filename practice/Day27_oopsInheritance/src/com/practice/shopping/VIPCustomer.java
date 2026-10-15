package com.practice.shopping;

public class VIPCustomer extends Customer {
	public VIPCustomer(int customerId, String customerName, double purchaseAmount) {
		super(customerId, customerName, purchaseAmount);
	}

	@Override
	public double calculateDiscount() {
		return getPurchaseAmount() * 0.15; // 15%
	}
}
