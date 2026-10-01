package com.kodewala.whileLoop;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter max no. ");
		int max = sc.nextInt();

//		int max = 10;
		int num = 0;

		while (num < max) {

			System.out.println("Exeucting... " + num);

//			num = num + 1;
			num++;

		}

	}

}
