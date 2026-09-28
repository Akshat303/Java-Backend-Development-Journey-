package com.method;

public class MethodPractice {

	public static void main(String[] args) {

		MethodPractice hi = new MethodPractice();
		hi.hello();

		System.out.println("add method call whith the help of obj b/c Method is not static");
		MethodPractice add = new MethodPractice();
		int sum = add.sum(7, 8);
		System.out.println(sum);

		System.out.println("average method call without obj b/c Method  is ststic");
		average(5, 6);
		
	
		System.out.println(averageWithoutStatic(9,8));

	}

	// ===============Method===============

	public int sum(int a, int b) {
		return a + b;
	}

	public void hello() {
		System.out.println("hello2 World");
	}

	public static void average(int a, int b) {
		double avg = (a + b) / 2;
		System.out.println(avg);
	}
	
	public static double averageWithoutStatic(int a, int b) {
	 	double avg = (a + b) / 2;
		return avg;
	}

}
