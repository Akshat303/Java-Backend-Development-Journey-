package com.practice.studentResult;

public class StudentResult {

	private String name;
	private int javaMarks;
	private int sqlMarks;
	private int dsaMarks;

	public StudentResult(String _name, int _javaMarks, int _sqlMarks, int _dsaMarks) {

		this.name = _name;
		this.javaMarks = _javaMarks;
		this.sqlMarks = _sqlMarks;
		this.dsaMarks = _dsaMarks;
	}

	public void calculateResult() {

		int total = javaMarks + sqlMarks + dsaMarks;
		double percentage = total / 3.0;

		System.out.println("Student: " + name);
		System.out.println("Total: " + total);

		/**
		 * %.2f ka matlab:
		 * %f → decimal number 
		 * .2 → decimal ke baad 2 digits 
		 * %n → new line
		 */
		System.out.printf("Percentage: %.2f%n", percentage);

		if (javaMarks < 40 || sqlMarks < 40 || dsaMarks < 40) {

			System.out.println("Result: Fail");
		} else if (percentage >= 90) {
			System.out.println("Grade: A");
		} else if (percentage >= 75) {
			System.out.println("Grade: B");
		} else if (percentage >= 60) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: D");
		}
	}
}