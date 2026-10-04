package com.loop;

public class CountRepeat {

	public static void main(String[] args) {

		int n = 4599996;

		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem == 9) {
				count++;
			}
			n = n / 10;
		}

		System.out.println(count);

	}

}
