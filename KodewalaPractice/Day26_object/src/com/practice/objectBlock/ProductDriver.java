package com.practice.objectBlock;

public class ProductDriver {

	public static void main(String[] args) {

		System.out.println("Main started");

		Product p1 = new Product();
		Product p2 = new Product();

		System.out.println("Final count: " + Product.count);
		System.out.println("First price: " + p1.price);
		System.out.println("Second price: " + p2.price);
	}
}