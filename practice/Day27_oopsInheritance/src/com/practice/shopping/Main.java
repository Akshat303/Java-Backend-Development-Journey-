package com.practice.shopping;

public class Main {
	public static void main(String[] args) {
		Customer regular = new RegularCustomer(101, "Rohit", 10000);
		Customer premium = new PremiumCustomer(102, "Aditya", 10000);
		Customer vip = new VIPCustomer(103, "Meera", 10000);

		System.out.println("---- Regular Customer ----");
		regular.displayDetails();

		System.out.println("\n---- Premium Customer ----");
		premium.displayDetails();

		System.out.println("\n---- VIP Customer ----");
		vip.displayDetails();
	}
}
