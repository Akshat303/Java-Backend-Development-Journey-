package com.kodewala.scan;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name : ");
		String name = sc.nextLine(); // reading string argument

		System.out.print("Enter age : ");
		int age = 0;
		if (sc.hasNextInt()) {
			age = sc.nextInt();
		} else {
			System.out.println("Enter Correct age");
		}

		sc.nextLine();

		System.out.print("Enter branch : ");
		String branch = sc.nextLine();

		System.out.println("Name -> " + name);
		System.out.println("Age -> " + age);
		System.out.println("Branch -> " + branch);

	}

}
