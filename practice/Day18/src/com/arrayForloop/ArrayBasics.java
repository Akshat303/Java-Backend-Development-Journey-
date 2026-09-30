package com.arrayForloop;

public class ArrayBasics {

	int[] numbers;

	// Constructor

	public ArrayBasics(int[] _numbers) {
		this.numbers = _numbers;

	}

	/**
	 * Addition
	 * 
	 * @return
	 */
	public int addition() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}

	/**
	 * Find Maximum no..
	 * 
	 * @return
	 */
	public int findMaxNo() {

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return max;
	}

	/**
	 * Find Minimum no.
	 * 
	 * @return
	 */

	public int findMinNo() {

		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return min;
	}
	
	/**
	 * Find Average
	 * @return
	 */

	public double calculateAverage() {

		return (double) addition() / numbers.length;
	}

	public void displayResult() {

		System.out.println("Sum = " + addition());
		System.out.println("Average = " + calculateAverage());
		System.out.println("Maximum = " + findMaxNo());
		System.out.println("Minimum = " + findMinNo());
	}

}
