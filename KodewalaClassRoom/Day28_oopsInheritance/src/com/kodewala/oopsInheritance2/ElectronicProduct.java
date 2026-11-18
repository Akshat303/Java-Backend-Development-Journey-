package com.kodewala.oopsInheritance2;

public class ElectronicProduct extends Product {
	boolean isWarranty;
	int warrantyInYears;

	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}

	public void viewElectronicProductDetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWarranty);
		System.out.println(warrantyInYears);
	}
}
