package com.akshat;

public class SumTwoNo {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = SumTwoNo.addTwoNo(num1, num1);
		System.out.println(num1 + " + " + num2 + " = " + sum );
	}
	
	static int addTwoNo(int a, int b) {
		return a+b;
	}
}
