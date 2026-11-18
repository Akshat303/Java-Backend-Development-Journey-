package com.practice.string;

public class DriverEmployeeNameProcessor {

	public static void main(String[] args) {

		EmployeeNameProcessor processor = new EmployeeNameProcessor("Akshat", "Srivastava");

		// 1. Create original full name
		String fullName = processor.createFullName();

		System.out.println("Original Full Name : " + fullName);

		// 2. Convert to uppercase
		String upperCaseName = processor.convertToUpperCase(fullName);

		System.out.println("\nUppercase Name     : " + upperCaseName);
		System.out.println("Original Full Name : " + fullName);

		// 3. Convert to lowercase
		String lowerCaseName = processor.convertToLowerCase(fullName);

		System.out.println("\nLowercase Name     : " + lowerCaseName);
		System.out.println("Original Full Name : " + fullName);

		// 4. Replace Akshat with Java
		String modifiedName = processor.replaceName(fullName);

		System.out.println("\nModified Name      : " + modifiedName);
		System.out.println("Original Full Name : " + fullName);

		// 5. Check whether original String changed
		System.out.println("\nOriginal String Changed? " + (fullName.equals(modifiedName)));

		// 6. Compare using ==
		System.out.println("\nUsing ==            : " + (fullName == modifiedName));

		// 7. Compare using equals()
		System.out.println("Using equals()      : " + fullName.equals(modifiedName));

		// 8. identityHashCode()
		System.out.println("\nIdentity HashCodes:");

		System.out.println("Original Full Name  : " + System.identityHashCode(fullName));

		System.out.println("Uppercase Name      : " + System.identityHashCode(upperCaseName));

		System.out.println("Lowercase Name      : " + System.identityHashCode(lowerCaseName));

		System.out.println("Modified Name       : " + System.identityHashCode(modifiedName));
	}
}