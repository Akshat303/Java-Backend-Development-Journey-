package com.day38_practiceOOPs.smarthome;

public class SmartRobotVacuum extends SmartDevice implements WiFiConnected, BatteryOperated {
    private boolean connectedToWiFi;
    private int batteryPercentage;

    public SmartRobotVacuum(String deviceId, String deviceName, int initialBattery) {
        super(deviceId, deviceName);
        if (initialBattery < 0 || initialBattery > 100) {
            throw new IllegalArgumentException("Battery percentage must be between 0 and 100.");
        }
        this.batteryPercentage = initialBattery;
        this.connectedToWiFi = false;
    }

    // WiFiConnected contract
    @Override
    public void connectToInternet(String ssid, String password) {
        if (password != null && password.length() >= 8) {
            this.connectedToWiFi = true;
            System.out.println("[" + getDeviceName() + "] Successfully connected to Wi-Fi network: " + ssid);
        } else {
            System.err.println("[" + getDeviceName() + "] Failed to connect: Invalid credentials.");
        }
    }

    @Override
    public boolean isConnected() {
        return connectedToWiFi;
    }

    @Override
    public void sendNotification(String message) {
        if (!connectedToWiFi) {
            System.err.println("[" + getDeviceName() + "] Cannot send notification: Device is OFFLINE.");
            return;
        }
        System.out.println("[ALERT from " + getDeviceName() + " via Cloud]: " + message);
    }

    // BatteryOperated contract
    @Override
    public int getBatteryLevel() {
        return batteryPercentage;
    }

    @Override
    public void recharge() {
        System.out.println("[" + getDeviceName() + "] Returning to charging dock... Fast charging initiated.");
        this.batteryPercentage = 100;
        sendNotification("Battery fully charged to 100%. Ready for cleaning.");
    }

    @Override
    public void getStatusSummary() {
        System.out.println("Vacuum Status -> WiFi: " + (connectedToWiFi ? "ONLINE" : "OFFLINE") 
                + " | Battery: " + batteryPercentage + "%");
    }
}