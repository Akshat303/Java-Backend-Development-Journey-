package com.string.finalPractice;

public class DriverEmployee {

	public static void main(String[] args) {
		// Create Developer and Manager objects
		Employee dev = new Developer();
		Employee mgr = new Manager();

		// Print salary details
		System.out.println("=== Developer ===");
		dev.displaySalary();

		System.out.println("\n=== Manager ===");
		mgr.displaySalary();
	}
}
