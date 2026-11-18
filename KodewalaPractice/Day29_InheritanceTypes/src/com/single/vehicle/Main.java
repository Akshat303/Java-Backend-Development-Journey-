package com.single.vehicle;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 120, "Petrol");

        car.start(); // inherited method
        car.displayCarDetails();
    }
}