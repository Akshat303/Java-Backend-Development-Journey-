package com.kodewala.oopsInheritance2;

public class Driver {

	public static void main(String[] args) {

		// Base Product object
		System.out.println("Product.1");
		Product product = new Product("Vivo", "This is Vivo mobile", 7, "In-Stock");
		product.viewProductDetails();

		// ElectronicProduct object
		System.out.println("Product.2");
		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", "This is iphone", 12, "In-Stock", true,
				2);
		electronicProduct.viewElectronicProductDetails();

		System.out.println("--------------Clothing Product---------------");

		// ClothingProduct object

		ClothingProduct clothingProduct = new ClothingProduct("T-Shirt", "Cotton round-neck T-shirt", 27, "Available",
				"L", "Cotton");

		clothingProduct.viewClothingProductDetails();
	}
}
