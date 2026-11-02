package com.day38_39_interface.lambda;

public class DriverSquareNumber {

	public static void main(String[] args) {
		SquareNumber sqNum = (num) -> {
			return (num * num);
		};
		int num = 5;
		int squareNo = sqNum.findSquare(num);
		System.out.println("Square of "+ num + " is " + squareNo);

	}

}
