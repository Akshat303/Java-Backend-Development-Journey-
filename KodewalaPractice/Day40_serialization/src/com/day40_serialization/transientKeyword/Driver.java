package com.day40_serialization.transientKeyword;

public class Driver {

	public static void main(String[] args) throws Exception {

		User user = new User("Akshat", "12345");

		UserSerialization us = new UserSerialization();

		us.serializeUser(user);

		UserDeserialization ud = new UserDeserialization();

		User u = ud.deserializeUser();

		System.out.println("Username : " + u.getUsername());

		System.out.println("Password : " + u.getPassword());
	}
}