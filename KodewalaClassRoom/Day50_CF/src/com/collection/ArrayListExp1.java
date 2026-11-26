package com.collection;

import java.util.ArrayList;

public class ArrayListExp1
{

	public static void main(String[] args)
	{
		ArrayList<String> cityName = new ArrayList<String>(50); // initialize size 50 and dynamically increase the size
																// 1.5x / 50% of old memory

		cityName.add("Bangalore");
		cityName.add("Bangalore2");
		cityName.add("Bangalore3");
		cityName.add("Bangalore4");
		cityName.add("Bangalore5");
		cityName.add("Bangalore6");
		cityName.add("Bangalore7");
		cityName.add("Bangalore8");
		cityName.add("Bangalore9");
		cityName.add("Bangalore10");

		cityName.add("Delhi1");
		cityName.add("Delhi2");
		cityName.add("Delhi3");
		cityName.add("Delhi4");
		cityName.add("Delhi5");

		cityName.add("Mumbai");

		System.out.println(cityName);

	}

}
