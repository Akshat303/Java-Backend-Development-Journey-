package com.basic;

import java.util.Scanner;

public class InputPractice {

	public static void main(String[] args) {
		System.out.println("Hello world");

		/**
		 * How to take input
		 */
		System.out.print("Enter Name : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("My name is " + sc.next());

		System.out.print("Enter Age : ");
		byte age = sc.nextByte();
		System.out.print("Enter Mobile no : ");
		int moNo = sc.nextInt();

		System.out.println("My age is " + age);
		System.out.println("My age is " + moNo);

		/**
		 * Call function
		 */
		System.out.println("while loop loop");
		whileLoop();
		System.out.println("for loop");
		forLoop();

	}

	public static void whileLoop() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter last no 1 to ");
		int j = input.nextInt();
		int i = 1;
		while (i <= j) {
			System.out.println(i);
			i++;
		}
	}

	public static void forLoop() {
		for (int k = 1; k!= 5; k++) {
			System.out.println(k);
		}
	}

}
