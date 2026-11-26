package com.collection.arrayList;

import java.util.ArrayList;

public class ArrayListLearn
{

	public static void main(String[] args)
	{
		ArrayList<String> cities = new ArrayList<String>();

		cities.add("Pune");
		cities.add("Mum");
		cities.add("Blr");
		cities.add("Dl");
		cities.add("Ahm");
		cities.add("Dhn");
		cities.add("Ptn");
		cities.add("Goa");

		 cities.remove(3);
		 cities.add(6, "MySore");

		System.out.println(cities);

	}

}
