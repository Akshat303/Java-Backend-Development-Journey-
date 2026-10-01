package com.kodewala.whileLoop;

import java.util.Scanner;

public class GuessNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int luckyNo = 17;
		int userNo = 0;

		while (luckyNo != userNo) {

			System.out.print("Enter no : ");
			if (sc.hasNextInt()) {
				userNo = sc.nextInt();
				if (luckyNo == userNo) {
					System.out.println("Won");
				} else {
					System.out.println("Try again");
				}
			} else {
				System.out.println("Not valid No.");
				break;
			}

		}

	}

}
