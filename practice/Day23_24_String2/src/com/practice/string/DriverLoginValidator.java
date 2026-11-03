package com.practice.string;

public class DriverLoginValidator {

		public static void main(String[] args) {

			String storedUsername = "Akshat";
			String storedPassword = "Java123";

			LoginValidator validator = new LoginValidator(
					storedUsername,
					storedPassword
			);

			// Normal String values
			String enteredUsername = "Akshat";
			String enteredPassword = "Java123";

			System.out.println("=== Normal String Test ===");

			System.out.println("Username using equals(): "
					+ storedUsername.equals(enteredUsername));

			System.out.println("Password using equals(): "
					+ storedPassword.equals(enteredPassword));

			if (validator.validateLogin(enteredUsername, enteredPassword)) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Invalid Username/Password");
			}

			// new String() creates different String objects
			String enteredUsername2 = new String("Akshat");
			String enteredPassword2 = new String("Java123");

			System.out.println("\n=== new String() Test ===");

			// == compares references
			System.out.println("Username using ==: "
					+ (storedUsername == enteredUsername2));

			System.out.println("Password using ==: "
					+ (storedPassword == enteredPassword2));

			// equals() compares content
			System.out.println("Username using equals(): "
					+ storedUsername.equals(enteredUsername2));

			System.out.println("Password using equals(): "
					+ storedPassword.equals(enteredPassword2));

			if (validator.validateLogin(enteredUsername2, enteredPassword2)) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Invalid Username/Password");
			}
		}
	}