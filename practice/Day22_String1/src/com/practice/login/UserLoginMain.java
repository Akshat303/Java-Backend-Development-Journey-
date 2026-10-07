package com.practice.login;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Registered user
		UserLoginSystem user = new UserLoginSystem("akshat", "java123");

		System.out.print("Enter Username: ");
		String enteredUsername = scanner.nextLine();

		System.out.print("Enter Password: ");
		String enteredPassword = scanner.nextLine();

		String result = user.login(enteredUsername, enteredPassword);

		System.out.println(result);

		scanner.close();
	}
}