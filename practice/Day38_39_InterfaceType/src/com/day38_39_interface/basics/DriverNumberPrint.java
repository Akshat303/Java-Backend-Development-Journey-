package com.day38_39_interface.basics;

public class DriverNumberPrint {

	public static void main(String[] args) {
		NumberPrintLambda num1 = () -> {
			return 100;
		};

		System.out.println(num1.num());

	}

}
