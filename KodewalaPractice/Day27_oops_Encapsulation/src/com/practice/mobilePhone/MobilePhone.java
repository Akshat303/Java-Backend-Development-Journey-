package com.practice.mobilePhone;

public class MobilePhone {

	private String brand;
	private String model;
	private int batteryPercentage;
	private int volume;

	// Constructor
	public MobilePhone(String brand, String model, int batteryPercentage, int volume) {
		this.brand = brand;
		this.model = model;
		this.batteryPercentage = validateRange(batteryPercentage);
		this.volume = validateRange(volume);
	}

	// Helper method to keep values between 0–100
	private int validateRange(int value) {
		if (value < 0) {
			return 0;
		}
		if (value > 100) {
			return 100;
		}
		return value;
	}

	// Controlled battery charging
	public void chargeBattery(int percentage) {
		if (percentage > 0) {
			batteryPercentage += percentage;
			if (batteryPercentage > 100) {
				batteryPercentage = 100;
			}
		}
	}

	// Controlled volume change
	public void changeVolume(int volume) {
		this.volume = validateRange(volume);
	}

	// Getters
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public int getVolume() {
		return volume;
	}
}
