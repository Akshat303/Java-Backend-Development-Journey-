package com.kodewala.oopsInheritance2;

public class Product {
	// Generic product details (Common for all products)
	String productName;
	String description;
	int quantity;
	String status;

	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}

	public void viewProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
	}
}
