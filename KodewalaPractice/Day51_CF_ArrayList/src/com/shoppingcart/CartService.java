package com.shoppingcart;

public interface CartService
{

	void addProduct(String product);

	void removeProduct(String product);

	void insertProduct(int index, String product);

	void displayProducts();

	void checkCartStatus();

	void sortProducts();

	void displayTopProducts(int count);

	void removeMultipleProducts();
}
