package com.kodewala.collections1;

import java.util.ArrayList;

public class ArrayListExp
{

	public static void main(String[] args)
	{
		// create a container which will hold something(object)
		ArrayList<String> learners = new ArrayList<String>();

		// Storing the data
		learners.add("Akshat");
		learners.add("Amit");
		learners.add("Rohit");
		learners.add("Rakesh");
		learners.add("Akshat");
		learners.add("Rohit");
		learners.add("Akshat");
		learners.add(null);
		learners.add(null);

		// read the data from container / arraylist
		System.out.println(learners);
	}

}
