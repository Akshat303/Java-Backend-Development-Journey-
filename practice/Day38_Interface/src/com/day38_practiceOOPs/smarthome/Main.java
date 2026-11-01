package com.day38_practiceOOPs.smarthome;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SmartRobotVacuum vacuum = new SmartRobotVacuum("VAC-01", "Roborock S7", 18);
        SmartWallPlug plug = new SmartWallPlug("PLUG-99", "Living Room Geyser Plug");

        System.out.println("================ IOT SMART HOME HUB ================\n");

        // 1. Role-based grouping: Only WiFi-enabled devices
        List<WiFiConnected> networkDevices = List.of(vacuum, plug);

        System.out.println("--- Step 1: Connecting all network devices to Home Router ---");
        for (WiFiConnected device : networkDevices) {
            device.connectToInternet("Home_5G_Fiber", "Secur3P@ssw0rd");
        }

        System.out.println("\n--- Step 2: Testing device actions ---");
        plug.togglePower(true);

        // 2. Battery health check (Only Battery-Operated devices)
        System.out.println("\n--- Step 3: Energy monitor routine ---");
        if (vacuum.getBatteryLevel() < 20) {
            vacuum.sendNotification("Low Battery warning! Level: " + vacuum.getBatteryLevel() + "%");
            vacuum.recharge();
        }

        System.out.println("\n--- Step 4: Final Device Summaries ---");
        vacuum.getStatusSummary();
        plug.getStatusSummary();

        System.out.println("\n====================================================");
    }
}