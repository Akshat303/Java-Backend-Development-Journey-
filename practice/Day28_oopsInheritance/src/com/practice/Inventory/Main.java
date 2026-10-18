package com.practice.Inventory;

public class Main {
	public static void main(String[] args) {
		// Create T-shirt
		ClothingProduct tshirt = new ClothingProduct("T-Shirt", "Casual wear", 20, 500, "M", "Cotton");
		tshirt.viewClothingDetails();

		// Sell 5 items
		tshirt.sellProduct(5);
		// Add 10 items
		tshirt.addStock(10);
		System.out.println("✅ Updated T-shirt stock: " + tshirt.getQuantity());

		// Try selling 100 items
		tshirt.sellProduct(100);
		System.out.println("Final T-shirt stock: " + tshirt.getQuantity());

		// Create Laptop
		ElectronicProduct laptop = new ElectronicProduct("Laptop", "Gaming laptop", 8, 75000, 2, "ASUS");
		laptop.viewElectronicDetails();
	}
}
