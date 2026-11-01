package com.day38_practiceOOPs.vehicle;

public class PetrolCar extends Vehicle {
	private final int fuelCapacityLitres;

	public PetrolCar(String model, String registrationNumber, int fuelCapacityLitres) {
		super(model, registrationNumber);
		if (fuelCapacityLitres <= 0) {
			throw new IllegalArgumentException("Fuel capacity must be positive.");
		}
		this.fuelCapacityLitres = fuelCapacityLitres;
	}

	public int getFuelCapacityLitres() {
		return fuelCapacityLitres;
	}

	@Override
	public void startEngine() {
		if (isEngineRunning()) {
			System.out.println("[" + getModel() + "]: Petrol engine is already running!");
			return;
		}

		System.out.println("\n--- Starting Petrol Engine [" + getModel() + "] ---");
		System.out.println("1. Turning mechanical ignition key...");
		System.out.println("2. Fuel pump pumping petrol into combustion chambers...");
		System.out.println("3. Spark plugs firing... Starter motor cranking...");
		System.out.println("4. Internal Combustion initiated. Vroom! Engine idling at 800 RPM.");
		setEngineRunning(true);
	}
}