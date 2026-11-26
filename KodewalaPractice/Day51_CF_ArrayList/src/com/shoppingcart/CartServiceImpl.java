package com.shoppingcart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartServiceImpl implements CartService
{

	private ArrayList<String> cart = new ArrayList<>();

	@Override
	public void addProduct(String product)
	{
		cart.add(product);
	}

	@Override
	public void removeProduct(String product)
	{
		cart.remove(product);
	}

	@Override
	public void insertProduct(int index, String product)
	{
		cart.add(index, product);
	}

	@Override
	public void displayProducts()
	{

		System.out.println("\n----- Shopping Cart -----");

		for (String product : cart)
		{
			System.out.println(product);
		}
	}

	@Override
	public void checkCartStatus()
	{

		if (cart.isEmpty())
		{
			System.out.println("Cart is Empty");
		}
		else
		{
			System.out.println("Cart is Not Empty");
		}
	}

	@Override
	public void sortProducts()
	{

		Collections.sort(cart);

		System.out.println("\nProducts Sorted Successfully");
	}

	@Override
	public void displayTopProducts(int count)
	{

		List<String> topProducts = cart.subList(0, Math.min(count, cart.size()));

		System.out.println("\nTop Products :");

		for (String product : topProducts)
		{
			System.out.println(product);
		}
	}

	@Override
	public void removeMultipleProducts()
	{

		ArrayList<String> removeItems = new ArrayList<>();

		removeItems.add("Mouse");
		removeItems.add("Pen Drive");

		cart.removeAll(removeItems);

		System.out.println("\nMouse and Pen Drive Removed Successfully");
	}
}