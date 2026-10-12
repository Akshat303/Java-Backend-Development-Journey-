package com.string.finalPractice;

//Declared final: cannot be subclassed
public final class AppConfig {

	// Static final constants
	public static final String APP_NAME = "MyApplication";
	public static final int MAX_LOGIN_ATTEMPTS = 5;
	public static final int DEFAULT_TIMEOUT = 30; // seconds

	// Private final instance fields
	private final String databaseUrl;
	private final String environment;

	// Constructor with validation
	public AppConfig(String databaseUrl, String environment) {
		if (databaseUrl == null || databaseUrl.isBlank()) {
			throw new IllegalArgumentException("Database URL cannot be null or blank");
		}
		if (environment == null || environment.isBlank()) {
			throw new IllegalArgumentException("Environment cannot be null or blank");
		}
		this.databaseUrl = databaseUrl;
		this.environment = environment;
	}

	// Getters only (no setters)
	public String getDatabaseUrl() {
		return databaseUrl;
	}

	public String getEnvironment() {
		return environment;
	}
}
