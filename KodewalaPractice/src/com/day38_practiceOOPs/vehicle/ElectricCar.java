package com.day38_practiceOOPs.vehicle;

public class ElectricCar extends Vehicle {
    private final int batteryCapacityKwh;

    public ElectricCar(String model, String registrationNumber, int batteryCapacityKwh) {
        super(model, registrationNumber);
        if (batteryCapacityKwh <= 0) {
            throw new IllegalArgumentException("Battery capacity must be positive.");
        }
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }

    @Override
    public void startEngine() {
        if (isEngineRunning()) {
            System.out.println("[" + getModel() + "]: High-voltage EV system is already active!");
            return;
        }

        System.out.println("\n--- Powering Up Electric Powertrain [" + getModel() + "] ---");
        System.out.println("1. Pressing start button with key fob in proximity...");
        System.out.println("2. Battery Management System (BMS) running safety checks...");
        System.out.println("3. High-voltage contactors engaging with a soft 'click'...");
        System.out.println("4. Inverter online and electric drive motors armed. System ready in dead silence (READY indicator ON).");
        setEngineRunning(true);
    }
}