package com.constructor.practice;

public class GameProduct extends Product {
	
	String genre;
	String platform;
	/**
	 * @param _name
	 * @param _price
	 * @param _sku
	 * @param _productType
	 * @param _description
	 * @param _stock
	 * @param _rating
	 * @param _available
	 */
	public GameProduct(
			String _name, 
			double _price, 
			String _sku, 
			String _productType, 
			String _description, 
			int _stock,
			double _rating, 
			boolean _available,
			String _genre,
			String _platform) 
			{
				super(_name, _price, _sku, _productType, _description, _stock, _rating, _available);
				this.genre =_genre;
				this.platform = _platform; 
			}
	
	// Display Method
	
	void displayGame() {
		System.out.println("Genre : " + genre);
		System.out.println("Platform : " + platform);
	}
	

}
