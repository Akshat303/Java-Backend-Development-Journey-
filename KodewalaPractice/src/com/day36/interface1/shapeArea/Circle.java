package com.day36.interface1.shapeArea;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return Math.PI * radius * radius;
	}

}
