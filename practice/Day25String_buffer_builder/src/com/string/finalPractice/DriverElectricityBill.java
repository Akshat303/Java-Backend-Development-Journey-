package com.string.finalPractice;

public class DriverElectricityBill {

	public static void main(String[] args) {
		// Create two customers
		ElectricityBill customer1 = new ElectricityBill("Akshat", 120);
		ElectricityBill customer2 = new ElectricityBill("Riya", 200);

		// Print details
		System.out.println("Customer: " + customer1.getCustomerName());
		System.out.println("Units Consumed: " + customer1.getUnitsConsumed());
		System.out.println("Total Bill: " + customer1.calculateTotalBill());
		System.out.println("-----------------------------------");

		System.out.println("Customer: " + customer2.getCustomerName());
		System.out.println("Units Consumed: " + customer2.getUnitsConsumed());
		System.out.println("Total Bill: " + customer2.calculateTotalBill());

		// Experiment: try reassigning final variables
		// customer1.CUSTOMER_NAME = "New Name"; // ❌ Compilation error (final variable)
		// customer1.UNIT_RATE = 10.0; // ❌ Compilation error (final variable)

		// But unitsConsumed can be changed
		customer1.setUnitsConsumed(150);
		System.out.println("\nAfter updating units for " + customer1.getCustomerName());
		System.out.println("New Units: " + customer1.getUnitsConsumed());
		System.out.println("New Total Bill: " + customer1.calculateTotalBill());
	}
}
