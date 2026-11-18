package com.Funtion_Method;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]) {

//		sum1();
		int ans = sum2();
		System.out.println("Ans " + ans);

	}

//	return type value
	static int sum2() {
		Scanner in = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("Enter number 1: ");
		num1 = in.nextInt();
		System.out.print("Enter number 2: ");
		num2 = in.nextInt();
		sum = num1 + num2;
		return sum;
	}
	
	
//	no return type
	static void sum1() {
		Scanner in = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("Enter number 1: ");
		num1 = in.nextInt();
		System.out.print("Enter number 2: ");
		num2 = in.nextInt();
		sum = num1 + num2;
		System.out.println("The sum = " + sum);

	}

}
