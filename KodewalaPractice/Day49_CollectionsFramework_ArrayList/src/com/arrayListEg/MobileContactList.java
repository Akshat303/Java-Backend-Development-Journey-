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

public class MobileContactList
{

	public static void main(String[] args)
	{

		ArrayList<String> contactsNames = new ArrayList<String>();

		contactsNames.add("Akshat");
		contactsNames.add("Annu");
		contactsNames.add("Priti");
		contactsNames.add("Ravi");
		contactsNames.add("Akshat");
		contactsNames.add(null);
		contactsNames.add("Sumit");
		contactsNames.add(null);

		System.out.println(contactsNames);
		int size = contactsNames.size();
		System.out.println("Total no of contacts is " + size);

		System.out.println("get " + contactsNames.get(2));

		contactsNames.set(2, "Abhi"); // Replace Priti with Abhi
		contactsNames.set(5, "Aman"); // Replace Null with Aman

		System.out.println("Update list -> " + contactsNames);
		// contactsNames.clear();// remove all element in the list
		System.out.println(contactsNames.isEmpty());

		contactsNames.remove(1);
		System.out.println(contactsNames);

		System.out.println(contactsNames.contains("Ravi"));

		System.out.println(contactsNames.size());

	}

}
