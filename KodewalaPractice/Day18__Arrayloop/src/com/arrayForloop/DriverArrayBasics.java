package com.arrayForloop;

import java.util.Arrays;
import java.util.Scanner;

public class DriverArrayBasics {

	public static void main(String[] args) {
//		int[] numbers = {10, 25, 5, 63,11};

//		get user input numbers
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = in.nextInt();

		int[] numbers = new int[size];

//		 get numbers from user

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = in.nextInt();
		}

//		Print no using Arrays.toString() method
		ArrayBasics obj = new ArrayBasics(numbers);

//		Print no using For loop
		System.out.println(Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ",");
		}

		System.out.println("\n");

		// Call Display Result add, min, max, avg
		obj.displayResult();

	}

}
