package com.kodewala.string;

public class Driver {

	public static void main(String[] args) {
		// Create a string object

		String fName = "Kodewala";
		// object created in SCP --> fName's address --> abc123

		String sName = "Kodewala";
		// object with content "Kodewala" already created and sName will refer to
		// existing object, sName is also pointing to address abc123.

		System.out.println(fName.length()); //8

		String city = new String("Bangalore");
		String cityName = "Bangalore";

		System.out.println(fName == sName); // true

		System.out.println(city == cityName); //false
		
		
		/**
		 * .equal() And = =
		 */
		String user1 = "Akshat";
		String user2 = new String("Akshat");

		System.out.println(user1.equals(user2)); //.equals() Content / Value same? //true
		System.out.println(user1==user2);  //Reference / Object same ? // false
		
		
//		understand String immutability.
		String name = "Akshat";

		System.out.println(name); // Akshat
		System.out.println(System.identityHashCode(name)); //HasCode value obj 1   

		name = name.toUpperCase();

		System.out.println(name); //AKSHAT
		System.out.println(System.identityHashCode(name)); //HasCode value of obj 2
		
			/**
			 * Before:
			
			name ───────► [ "Akshat" ]
			                 ↑
			              Object A
			
			
			After:
			
			name ───────► [ "AKSHAT" ]
			                 ↑
			              Object B
			 */

	}

}
