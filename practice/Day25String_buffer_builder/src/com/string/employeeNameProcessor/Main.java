package com.string.employeeNameProcessor;

public class Main {
	public static void main(String[] args) {
		// Using StringBuilder
		System.out.println("=== Using StringBuilder ===");
		EmployeeNameProcessor processor = new EmployeeNameProcessor("Akshat");
		processor.append(" Srivastava");
		processor.insert(0, "Mr. ");
		processor.replace(0, 3, "Developer");
		processor.delete(9, 10); // delete extra space after "Developer"
		processor.reverse();

		// Using String concatenation
		System.out.println("\n=== Using String Concatenation ===");
		String name = "Akshat";
		System.out.println("Initial name: " + name);
		System.out.println("Identity Hash Code: " + System.identityHashCode(name));

		name = name + " Srivastava";
		System.out.println("After append: " + name);
		System.out.println("Identity Hash Code: " + System.identityHashCode(name));

		name = "Mr. " + name;
		System.out.println("After insert: " + name);
		System.out.println("Identity Hash Code: " + System.identityHashCode(name));

		name = name.replace("Mr.", "Developer");
		System.out.println("After replace: " + name);
		System.out.println("Identity Hash Code: " + System.identityHashCode(name));

		name = name.replace("Developer ", "Developer"); // delete extra space
		System.out.println("After delete: " + name);
		System.out.println("Identity Hash Code: " + System.identityHashCode(name));

		String reversed = new StringBuilder(name).reverse().toString();
		System.out.println("After reverse: " + reversed);
		System.out.println("Identity Hash Code: " + System.identityHashCode(reversed));
	}
}
