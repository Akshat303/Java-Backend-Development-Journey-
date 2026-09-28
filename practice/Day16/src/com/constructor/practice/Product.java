package com.constructor.practice;

public class Product 
{

	String name;
	double price;
	String sku;
	String productType;
	String description;
	int stock;
	double rating;
	boolean available;

	public Product(
			String _name, 
			double _price, 
			String _sku, 
			String _productType, 
			String _description, 
			int _stock,
			double _rating, 
			boolean _available 
			) 
				{
					this.name = _name;
					this.price = _price;
					this.sku = _sku;
					this.productType = _productType;
					this.description = _description;
					this.stock = _stock;
					this.rating = _rating;
					this.available = _available;
				}
	/**
	 * system is getting / default value
	 */
	public  Product() {
		this(
		        "Unknown Product",
		        0.0,
		        "N/A",
		        "General",
		        "No description available",
		        0,
		        0.0,
		        false);
	}
	
//				 Display  default product parameter
	 void sysoDefault() {
		System.out.println("Name : " + this.name);
		System.out.println("Price : " +"₹"+ this.price);
		System.out.println("SKU : " + this.sku);
		System.out.println("Product Type : " + this.productType);
		System.out.println("Description : " + this.description);
		System.out.println("Stock : " + this.stock);
		System.out.println("Rating : " + this.rating);
		System.out.println("Available : " + this.available);
				

	}
				 
}
