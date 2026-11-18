package com.day38_39_interface.basics;

public class DriverPrintName {

	public static void main(String[] args) {

		PrintName myName = () -> {
			System.out.println("My name is Akshat");
		};

		myName.printName();

//		PrintName myName = NameMess.getName();
//		myName.printName();
	}
}