package com.day36.interface1.shapeArea;

public class Main {

	public static void main(String[] args) {

		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(10, 4);

		System.out.println("Circle Area: " + circle.calculateArea());

		System.out.println("Rectangle Area: " + rectangle.calculateArea());
	}
}
