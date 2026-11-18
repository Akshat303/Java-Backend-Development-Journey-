package com.practice.parkingFee;

public class ParkingFee {

	private String vehicleType;
	private float hours;

	public ParkingFee(String _vehicleType, float hours2) {
		this.vehicleType = _vehicleType;
		this.hours = hours2;
	}

	public float calculateFee() {

		if (hours <= 0) {
			return -1;
		}

		int rate;

		switch (vehicleType.toLowerCase()) {

		case "bike":
			rate = 20;
			break;

		case "car":
			rate = 40;
			break;

		case "truck":
			rate = 70;
			break;

		default:
			return -1;
		}

		return rate * hours;
	}
}