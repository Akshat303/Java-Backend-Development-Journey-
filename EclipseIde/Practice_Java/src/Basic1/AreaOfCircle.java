package Basic1;

import java.util.Scanner;

public class AreaOfCircle {

	private static Scanner sc;
	private static Scanner squareNo;

	public static void main(String[] args) {
		double rad = 3.8;

//		double rad = Double.parseDouble(args[0]); // Command line input
		double area = 3.14159 * rad * rad;
		System.out.println(area);

		sc = new Scanner(System.in);

		System.out.println("Enter radius");

		double radInput = sc.nextDouble();
		double areaCal = 3.14159 * radInput * radInput;

		System.out.println(areaCal);

//		Square

		squareNo = new Scanner(System.in);
		System.out.println("Square  No.");

		int sqNo = squareNo.nextInt();
		int sqCal = sqNo * sqNo;
		System.out.println("Square = " + sqCal);

	}

}
