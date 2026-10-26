package com.kodewala.polymorphism;

class Employee2 {

	void work() {
		System.out.println("Employee is Working");
	}
}

class Developer extends Employee2 {

	@Override
	void work() {
		System.out.println("Developer is Writing Code");
	}

	void writeCode() {
		System.out.println("Writing Java Code");
	}
}

public class MethodDriver {

	public static void main(String[] args) {

		// =========================
		// UPCASTING
		// =========================

		Employee2 emp = new Developer();

		/*
		 * Reference Type : Employee Actual Object : Developer
		 * 
		 * emp | v Developer Object
		 */

		emp.work(); // Developer is Writing Code

		// emp.writeCode();
		// ❌ Compile Error
		// Employee reference se Developer specific method access nahi hoga

		System.out.println("----------------");

		// =========================
		// DOWNCASTING
		// =========================

		Developer dev = (Developer) emp;

		/*
		 * emp -----------\ \ ---> Developer Object / dev -----------/
		 */

		dev.work(); // Developer is Writing Code
		dev.writeCode(); // Writing Java Code

		System.out.println("----------------");

		// =========================
		// WRONG DOWNCASTING
		// =========================

		Employee2 normalEmp = new Employee2();

		// Developer dev2 = (Developer) normalEmp;
		// ❌ Runtime Error
		// ClassCastException

		/*
		 * normalEmp | v Employee Object
		 * 
		 * Employee Object ko Developer me convert nahi kar sakte.
		 */
	}
}