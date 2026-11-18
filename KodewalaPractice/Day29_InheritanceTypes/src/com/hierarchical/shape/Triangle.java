package com.hierarchical.shape;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base,
                    double height) {

        validateDimension(base, "Base");
        validateDimension(height, "Height");

        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}