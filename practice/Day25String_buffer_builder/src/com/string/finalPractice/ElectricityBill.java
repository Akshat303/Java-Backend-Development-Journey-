package com.string.finalPractice;

public class ElectricityBill {

	// Constants
	private final double UNIT_RATE = 8.0; // final instance constant
	private static final double GST_RATE = 0.18; // static final class constant

	// Blank final instance variable
	private final String CUSTOMER_NAME;

	// Mutable field
	private double unitsConsumed;

	// Constructor initializes CUSTOMER_NAME
	public ElectricityBill(String customerName, double unitsConsumed) {
		this.CUSTOMER_NAME = customerName; // blank final initialized here
		this.unitsConsumed = unitsConsumed;
	}

	// Calculate bill before GST
	public double calculateBaseBill() {
		return unitsConsumed * UNIT_RATE;
	}

	// Calculate total bill including GST
	public double calculateTotalBill() {
		double baseBill = calculateBaseBill();
		return baseBill + (baseBill * GST_RATE);
	}

	// Getters
	public String getCustomerName() {
		return CUSTOMER_NAME;
	}

	public double getUnitsConsumed() {
		return unitsConsumed;
	}

	// Setter for unitsConsumed (allowed because it's not final)
	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
}
