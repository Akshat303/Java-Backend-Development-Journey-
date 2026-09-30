package com.kodewala.array1;

public class DriverUser {

	public static void main(String[] args) {

		User user1 = new User("Kodewala", "963258741");
		User user2 = new User("Akshat", "7410852285");
		User user3 = new User("Ravi", "856932104");
		User user4 = new User("Amit", "12654896");

		User User[] = new User[4];

		User[0] = user1;
		User[1] = user2;
		User[2] = user3;
		User[3] = user4;
		
		System.out.println(User[0].name);
		System.out.println(User[0].mobileNo);

	}

}
