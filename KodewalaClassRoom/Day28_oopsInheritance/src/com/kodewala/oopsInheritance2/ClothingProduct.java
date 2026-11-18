package com.kodewala.oopsInheritance2;

public class ClothingProduct extends Product {
	String size;
	String fabricType;

	public ClothingProduct(String productName, String description, int quantity, String status, String size,
			String fabricType) {
		super(productName, description, quantity, status);
		this.size = size;
		this.fabricType = fabricType;
	}

	public void viewClothingProductDetails() {
		System.out.println("Name- " + productName);
		System.out.println("Description- " + description);
		System.out.println("Quantity- " + quantity);
		System.out.println("Status- " + status);
		System.out.println("Size- " + size);
		System.out.println("Fabric- " + fabricType);
	}
}
