package com.loop;

import java.util.Scanner;

public class FibonacciNumer {

	public static void main(String[] args) {
//		 Fibonacci No. --> 0 1 1 2 3 5 8 13......add last two no.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. ");

		int no = sc.nextInt();

		int p = 0;
		int i = 1;
		int count = 2;

		while (count <= no) {
			int temp = i;
			i = i + p;
			p = temp;
			count++;
			System.out.print(i + " ");
		}

		System.out.println("\n Total " + i);

	}

}

/**
 * 10
 */
