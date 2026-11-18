package com.hierarchical.shape;

public abstract class Shape {

    public abstract double calculateArea();

    protected static void validateDimension(double value,
                                            String dimensionName) {

        if (value <= 0) {
            throw new IllegalArgumentException(
                    dimensionName + " must be positive");
        }
    }
}