package com.practice.shopping;

public class PremiumCustomer extends Customer {
	public PremiumCustomer(int customerId, String customerName, double purchaseAmount) {
		super(customerId, customerName, purchaseAmount);
	}

	@Override
	public double calculateDiscount() {
		return getPurchaseAmount() * 0.10; // 10%
	}
}
