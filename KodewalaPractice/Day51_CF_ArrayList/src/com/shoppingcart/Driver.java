package com.shoppingcart;

public class Driver
{

	public static void main(String[] args)
	{

		CartService service = new CartServiceImpl();

		// Add Products
		service.addProduct("Laptop");
		service.addProduct("Mouse");
		service.addProduct("Keyboard");
		service.addProduct("Monitor");
		service.addProduct("Pen Drive");

		System.out.println("Initial Cart");
		service.displayProducts();

		// Remove Keyboard
		service.removeProduct("Keyboard");

		// Insert Headphone at Index 1
		service.insertProduct(1, "Headphone");

		System.out.println("\nAfter Modifications");
		service.displayProducts();

		// Check Empty
		service.checkCartStatus();

		// Sort
		service.sortProducts();
		service.displayProducts();

		// First 3 Products
		service.displayTopProducts(3);

		// Remove Multiple Products
		service.removeMultipleProducts();

		System.out.println("\nFinal Cart");
		service.displayProducts();
	}
}