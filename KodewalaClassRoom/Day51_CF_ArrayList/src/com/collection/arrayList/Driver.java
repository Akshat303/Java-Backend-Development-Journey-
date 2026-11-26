package com.collection.arrayList;

import java.util.ArrayList;

public class Driver
{

	public static void main(String[] args)
	{
		String name = "Akshat";
		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);

		// Insert num
		num.add(0, 11);
		num.addFirst(17);
		num.addLast(10);
		num.add(4, 44);

		// Remove num

		num.remove(3);
		num.removeFirst();
		num.removeLast();

		System.out.println(num);

		System.out.println(name);

	}

}
