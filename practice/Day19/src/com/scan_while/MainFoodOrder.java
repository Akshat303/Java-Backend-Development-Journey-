package com.scan_while;

import java.util.Scanner;

public class MainFoodOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FoodOrder order = new FoodOrder();

		int choice = 0;

		while (choice != 4) {

			order.displayMenu();

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice == 1) {

				order.addItem(250);

			} else if (choice == 2) {

				order.addItem(150);

			} else if (choice == 3) {

				order.addItem(100);

			} else if (choice == 4) {

				System.out.println("Order Completed!");

			} else {

				System.out.println("Invalid Choice!");
			}
		}

		System.out.println("---------------------");
		System.out.println("Total Bill = ₹" + order.getTotalBill());
		System.out.println("Thank you for ordering!");

		sc.close();
	}
}