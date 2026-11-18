package com.arrayForloop;

import java.util.Arrays;

public class DriverDuplicateFinder {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 20, 40, 10, 50,50,60 };
		
		System.out.println(Arrays.toString(numbers));

		DuplicateFinder obj = new DuplicateFinder(numbers);

		obj.findDuplicates();
	}
}