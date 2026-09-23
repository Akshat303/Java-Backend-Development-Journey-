package com.constructore.day13;

public class DriverAccount {

	public static void main(String[] args) {

		Account acc = new Account(); // Default constructure call

		System.out.println(acc.amount + " " + acc.name);

		Account acc1 = new Account(2560, "Akshat");
		System.out.println(acc1.amount + " " + acc1.amount);

	}

}
