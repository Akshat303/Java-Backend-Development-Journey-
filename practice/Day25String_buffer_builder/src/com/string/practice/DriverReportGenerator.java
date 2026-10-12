package com.string.practice;

public class DriverReportGenerator {

	public static void main(String[] args) {
		ReportGenerator generator = new ReportGenerator();

		// String concatenation
		long start = System.nanoTime();
		String report1 = generator.generateWithString();
		long end = System.nanoTime();
		System.out.println("String concatenation time: " + (end - start) + " ns");

		// StringBuilder
		start = System.nanoTime();
		String report2 = generator.generateWithStringBuilder();
		end = System.nanoTime();
		System.out.println("StringBuilder time: " + (end - start) + " ns");

		// StringBuffer
		start = System.nanoTime();
		String report3 = generator.generateWithStringBuffer();
		end = System.nanoTime();
		System.out.println("StringBuffer time: " + (end - start) + " ns");

		// Confirm equivalence
		System.out.println("Reports equal (String vs StringBuilder): " + report1.equals(report2));
		System.out.println("Reports equal (StringBuilder vs StringBuffer): " + report2.equals(report3));
	}
}
