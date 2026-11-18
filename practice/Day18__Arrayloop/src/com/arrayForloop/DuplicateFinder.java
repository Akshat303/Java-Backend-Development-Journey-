package com.arrayForloop;

public class DuplicateFinder {

	int[] numbers;

	// Constructor
	public DuplicateFinder(int[] numbers) {
		this.numbers = numbers;
	}

	public void findDuplicates() {

		System.out.println("Duplicate elements:");

		for (int i = 0; i < numbers.length; i++) {

			// Check if this number was already checked
			boolean alreadyChecked = false;

			for (int k = 0; k < i; k++) {

				if (numbers[i] == numbers[k]) {
					alreadyChecked = true;
					break;
				}
			}

			if (alreadyChecked) {
				continue;
			}

			// Check whether duplicate exists
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] == numbers[j]) {

					System.out.println(numbers[i]);
					break;
				}
			}
		}
	}
}