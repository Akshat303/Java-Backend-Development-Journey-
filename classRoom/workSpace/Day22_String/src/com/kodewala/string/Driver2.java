	package com.kodewala.string;
	
	class User {
		String name;
	
		public User(String name) {
			this.name = name;
		}
	
	}
	
	public class Driver2 {
	
		public static void main(String[] args) {
	
			String city1 = "Bangalore"; // one object created --> abc123
			String city2 = "Bangalore"; // use the existing --> abc123
			String city3 = "Bangalore"; // use the existing --> abc123
			String city4 = "Bangalore"; // use the existing --> abc123
			String city5 = "Bangalore"; // use the existing --> abc123
	
			System.out.println(city1.equals(city1)); // true
			
			//Through  constructor
	
			User user1 = new User("Any");
			User user2 = new User("Any");
	
			System.out.println(user1.equals(user2)); // false because .equal() is not override
			System.out.println(user1 == user2); // false They are different objects.
			
			/**
			 *  user1 ───────► User Object 1
                 name = "Any"

				user2 ───────► User Object 2
                 name = "Any"

				The name is the same, but the objects are different.
			 */
	
		}
	
	}
