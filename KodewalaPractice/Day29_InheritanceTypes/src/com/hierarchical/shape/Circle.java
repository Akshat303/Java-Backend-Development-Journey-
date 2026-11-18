package com.hierarchical.shape;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {

        validateDimension(radius, "Radius");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}