package com.kodewala.constructors2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicProduct electronicProduct = new ElectronicProduct("Vivo tx4", 15000, "V014", "Mobile", 1);

		/**
		 * Print
		 */

		/*
		 * System.out.println("Name " + electronicProduct.name);
		 * System.out.println("Price " + "Rs" + electronicProduct.price);
		 * System.out.println("SKU " + electronicProduct.sku);
		 * System.out.println("Type " + electronicProduct.productType);
		 * System.out.println("Warranty " + electronicProduct.warranty + "year");
		 */

		/**
		 * Print with the help of method
		 */
		electronicProduct.display();
	}

}
