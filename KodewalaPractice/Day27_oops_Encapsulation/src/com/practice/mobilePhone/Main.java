package com.practice.mobilePhone;

public class Main {
	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 70, 30);

		phone.chargeBattery(50); // should cap at 100
		phone.changeVolume(80); // valid change

		System.out.println("Brand: " + phone.getBrand());
		System.out.println("Model: " + phone.getModel());
		System.out.println("Battery: " + phone.getBatteryPercentage() + "%");
		System.out.println("Volume: " + phone.getVolume());
	}
}
