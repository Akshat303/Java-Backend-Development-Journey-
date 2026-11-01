package com.day38_practiceOOPs.vehicle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Polymorphic references using abstract base class
        List<Vehicle> garage = List.of(
            new PetrolCar("Honda City i-VTEC", "KA-01-AB-1234", 40),
            new ElectricCar("Tata Nexon EV", "KA-05-EV-5678", 45)
        );

        System.out.println("================ VEHICLE FLEET MANAGEMENT SYSTEM ================\n");

        for (Vehicle vehicle : garage) {
            System.out.println("Vehicle: " + vehicle.getModel() + " | Reg: " + vehicle.getRegistrationNumber());
            
            // Concrete methods inherited directly
            vehicle.turnOnLights();
            vehicle.honk();

            // Polymorphic method execution (Abstraction in action)
            vehicle.startEngine();

            // Attempting duplicate start to test state flag
            vehicle.startEngine();

            // Stopping engine
            vehicle.stopEngine();
        }
    }
}