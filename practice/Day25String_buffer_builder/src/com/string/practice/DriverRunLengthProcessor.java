package com.string.practice;

import java.util.Scanner;

public class DriverRunLengthProcessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RunLengthProcessor processor = new RunLengthProcessor();

		System.out.println("Enter a string to compress:");
		String input = scanner.nextLine();

		String compressed = processor.compress(input);
		System.out.println("Compressed: " + compressed);

		String decompressed = processor.decompress(compressed);
		System.out.println("Decompressed: " + decompressed);
	}
}
