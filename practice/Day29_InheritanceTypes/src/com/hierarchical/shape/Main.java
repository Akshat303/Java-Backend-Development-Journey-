package com.hierarchical.shape;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(7),
                new Rectangle(10, 5),
                new Triangle(8, 6)
        };

        for (Shape shape : shapes) {

            System.out.println(
                    shape.getClass().getSimpleName());

            System.out.printf(
                    "Area: %.2f%n",
                    shape.calculateArea());

            System.out.println("----------------");
        }
    }
}