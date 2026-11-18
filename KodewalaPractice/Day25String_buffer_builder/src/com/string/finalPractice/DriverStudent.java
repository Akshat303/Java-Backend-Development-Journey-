package com.string.finalPractice;

public class DriverStudent {

	public static void main(String[] args) {
		// Final reference variables
		final Student student = new Student("Akshat", new int[] { 80, 85, 90 });
		final int[] numbers = { 10, 20, 30 };

		// 1. Change student.name
		student.name = "Riya"; // ✅ Allowed

		// 2. Change student.marks[0]
		student.marks[0] = 95; // ✅ Allowed

		// 3. Try assigning student = new Student(...)
		// student = new Student("New Student", new int[]{70, 75, 80}); // ❌ Compilation
		// error

		// 4. Change numbers[0]
		numbers[0] = 100; // ✅ Allowed

		// 5. Try assigning numbers = new int[]{1, 2, 3}
		// numbers = new int[]{1, 2, 3}; // ❌ Compilation error

		// Print results
		student.display();
		System.out.print("Numbers array: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
