package com.string.finalPractice;
//Attempting to extend AppConfig will cause a compiler error

//class CustomConfig extends AppConfig { } // ❌ Not allowed

public class DriverAppConfig {

	public static void main(String[] args) {
		// 1. Create configuration object for development environment
		AppConfig devConfig = new AppConfig("jdbc:mysql://localhost:3306/devdb", "development");

		// 2. Print all configuration values
		System.out.println("App Name: " + AppConfig.APP_NAME);
		System.out.println("Max Login Attempts: " + AppConfig.MAX_LOGIN_ATTEMPTS);
		System.out.println("Default Timeout: " + AppConfig.DEFAULT_TIMEOUT + " seconds");
		System.out.println("Database URL: " + devConfig.getDatabaseUrl());
		System.out.println("Environment: " + devConfig.getEnvironment());

		// 3. Attempt to change an instance field directly
		// devConfig.databaseUrl = "jdbc:mysql://localhost:3306/proddb"; // ❌
		// Compilation error (field is private final)

		// 4. Attempt to reassign a constant
		// AppConfig.APP_NAME = "NewApp"; // ❌ Compilation error (static final constant)

		// Demonstration complete
	}
}
