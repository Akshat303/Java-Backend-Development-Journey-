package com.kodewala.constructors2;

public class ElectronicProduct extends Product {

	int warranty;

	public ElectronicProduct(String _name, int _price, String _sku, String _productType, int _warranty) {
		super(_name, _price, _sku, _productType);
		this.warranty = _warranty;

	}

	public void display() {
		System.out.println("Name " + name);
		System.out.println("Price " + "₹" + price);
		System.out.println("SKU " + sku);
		System.out.println("Type " + productType);
		System.out.println("Warranty " + warranty + "year");
	}

}
