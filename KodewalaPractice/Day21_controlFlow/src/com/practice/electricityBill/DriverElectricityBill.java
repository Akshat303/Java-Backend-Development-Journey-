package com.practice.electricityBill;

import java.util.Scanner;

public class DriverElectricityBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Electricity Units : ");
		double unit = sc.nextDouble();

		ElectricityBill bill = new ElectricityBill(unit);
		double result = bill.calculateBill();

		if (result == -1) {
			System.out.println("Invalid Units");
		} else {
			System.out.println("Electricity Bill: ₹" + result);
		}

	}

}
