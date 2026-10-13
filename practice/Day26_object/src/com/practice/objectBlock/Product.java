package com.practice.objectBlock;

public class Product {

	static int count = 10;

	static {
		count += 5;
		System.out.println("Static block 1: " + count);
	}

	static {
		count *= 2;
		System.out.println("Static block 2: " + count);
	}

	int price = 100;

	{
		price += 50;
		System.out.println("Instance block 1: " + price);
	}

	{
		price *= 2;
		System.out.println("Instance block 2: " + price);
	}

	Product() {
		System.out.println("Constructor: " + price);
		count++;
	}
}