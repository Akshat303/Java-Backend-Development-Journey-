package com.practice.string;

public class StudentName {

	private String firstName;
	private String middleName;
	private String lastName;

	public StudentName(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	// Using concat()
	public String createFullNameUsingConcat() {

		String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);

		return fullName;
	}

	// Using +
	public String createFullNameUsingPlus() {

		String fullName = firstName + " " + middleName + " " + lastName;

		return fullName;
	}

	public void displayIdentityHashCodes() {

		String originalFirstName = firstName;
		String concatFullName = createFullNameUsingConcat();
		String plusFullName = createFullNameUsingPlus();

		System.out.println("Original firstName      : " + originalFirstName);
		System.out.println("HashCode of original    : " + System.identityHashCode(originalFirstName));

		System.out.println();

		System.out.println("Full Name using concat(): " + concatFullName);
		System.out.println("HashCode of concat()    : " + System.identityHashCode(concatFullName));

		System.out.println();

		System.out.println("Full Name using +       : " + plusFullName);
		System.out.println("HashCode of +           : " + System.identityHashCode(plusFullName));
	}
}