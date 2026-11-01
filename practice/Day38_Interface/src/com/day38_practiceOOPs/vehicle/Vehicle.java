package com.day38_practiceOOPs.vehicle;

public abstract class Vehicle {
	private final String model;
	private final String registrationNumber;
	private boolean engineRunning;

	protected Vehicle(String model, String registrationNumber) {
		if (model == null || model.isBlank()) {
			throw new IllegalArgumentException("Model name cannot be empty.");
		}
		if (registrationNumber == null || registrationNumber.isBlank()) {
			throw new IllegalArgumentException("Registration number cannot be empty.");
		}
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.engineRunning = false;
	}

	public String getModel() {
		return model;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public boolean isEngineRunning() {
		return engineRunning;
	}

	protected void setEngineRunning(boolean running) {
		this.engineRunning = running;
	}

	// Concrete Method 1: Common across all vehicles
	public void turnOnLights() {
		System.out.println("[" + model + " (" + registrationNumber + ")]: Headlights turned ON.");
	}

	// Concrete Method 2: Common across all vehicles
	public void honk() {
		System.out.println("[" + model + " (" + registrationNumber + ")]: Beep! Beep!");
	}

	// Common shutdown behavior
	public void stopEngine() {
		if (!engineRunning) {
			System.out.println("[" + model + "]: Engine/System is already OFF.");
			return;
		}
		setEngineRunning(false);
		System.out.println("[" + model + "]: Power cut off. Engine/System shutdown complete.");
	}

	// Abstract Method: Engine start mechanism must be implemented by subclasses
	public abstract void startEngine();
}