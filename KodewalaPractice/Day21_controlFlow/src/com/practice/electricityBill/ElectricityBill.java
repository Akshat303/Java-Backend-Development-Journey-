package com.practice.electricityBill;

public class ElectricityBill {

	// Instance Variable: every object will have its own units variable
	private double units;

	public ElectricityBill(double unit) {
		this.units = unit;
	}

	public double calculateBill() {
		if (units < 0) {
			return -1;
		}

		// Local Variable
		// 'bill' only inside the calculateBill() method available
		double bill = 0;
		if (units <= 1000) {
			bill = units * 5;
		} else if (units <= 200) {
			bill = (100 * 5) + ((units - 100) * 7);

		}
		else {
			bill = (100 * 5) + (100 *7) + ((units - 200)*10);
			
		}
		return bill + 100;
	}

}
