package com.day38_39_interface.lambda;

public class DriverSumTwoNumbers {
	public static void main(String[] args) {
		SumTwoNumbers sum = (num1, num2) -> {
			return (num1 + num2);
		};

		int result = sum.add(5, 9);
		System.out.println("Sum = " + result);

	}

}