package com.practice.shopping;

public class RegularCustomer extends Customer {
	public RegularCustomer(int customerId, String customerName, double purchaseAmount) {
		super(customerId, customerName, purchaseAmount);
	}

	@Override
	public double calculateDiscount() {
		return getPurchaseAmount() * 0.05; // 5%
	}
}
