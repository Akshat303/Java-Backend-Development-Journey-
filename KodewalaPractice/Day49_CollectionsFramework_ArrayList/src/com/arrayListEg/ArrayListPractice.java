package com.arrayListEg;

import java.util.ArrayList;
/*
Method	    Use
add()	    Add element
get()		Read element
set()		Update element
remove()	Delete element
size()		Count elements
contains()	Search element
clear()		Remove all
isEmpty()	Check empty
*/

public class ArrayListPractice
{

	public static void main(String[] args)
	{

		ArrayList<String> names = new ArrayList<>();

		names.add("Akshat");
		names.add("Ravi");
		names.add("Aman");

		System.out.println(names);

		System.out.println(names.get(0));

		names.set(1, "Rohit");

		names.remove(0);

		System.out.println(names);

		System.out.println(names.size());
	}
}
