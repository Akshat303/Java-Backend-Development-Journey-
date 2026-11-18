package com.string.stringComparisonLab;

public class StringComparisonLab {

	private String s1;
	private StringBuffer sb1;
	private StringBuilder sb2;

	public StringComparisonLab() {
		this.s1 = "Java";
		this.sb1 = new StringBuffer("Java");
		this.sb2 = new StringBuilder("Java");
	}

	public void printInitialValues() {
		System.out.println("Initial String: " + s1);
		System.out.println("Initial StringBuffer: " + sb1);
		System.out.println("Initial StringBuilder: " + sb2);
		System.out.println("--------------------------------------------------");
	}

	public void modifyValues() {
		// String is immutable, so we must reassign
		s1 = s1 + " Backend";
		sb1.append(" Backend");
		sb2.append(" Backend");

		System.out.println("After modification:");
		System.out.println("String: " + s1);
		System.out.println("StringBuffer: " + sb1);
		System.out.println("StringBuilder: " + sb2);
		System.out.println("--------------------------------------------------");
	}

	public void compareReferences() {
		System.out.println("Reference comparison (==):");
		System.out.println("String before vs after: false (new object created)");
		System.out.println("StringBuffer before vs after: true (same object)");
		System.out.println("StringBuilder before vs after: true (same object)");
		System.out.println("--------------------------------------------------");
	}

	public void compareContents() {
		System.out.println("Content comparison (.equals()):");
		System.out.println("String equals: true (compares content)");
		System.out.println("StringBuffer equals StringBuilder: " + sb1.equals(sb2));
		System.out.println("StringBuffer equals StringBuffer: " + sb1.equals(new StringBuffer("Java Backend")));
		System.out.println("StringBuilder equals StringBuilder: " + sb2.equals(new StringBuilder("Java Backend")));
		System.out.println("--------------------------------------------------");
	}

	public void compareToString() {
		System.out.println("Comparing via toString():");
		System.out.println("sb1.toString().equals(sb2.toString()): " + sb1.toString().equals(sb2.toString()));
		System.out.println("--------------------------------------------------");
	}
}
