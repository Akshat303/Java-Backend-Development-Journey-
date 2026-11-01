package com.day38_practiceOOPs.smarthome;

public class SmartWallPlug extends SmartDevice implements WiFiConnected {
    private boolean connectedToWiFi;
    private boolean relayActive;

    public SmartWallPlug(String deviceId, String deviceName) {
        super(deviceId, deviceName);
        this.connectedToWiFi = false;
        this.relayActive = false;
    }

    @Override
    public void connectToInternet(String ssid, String password) {
        this.connectedToWiFi = true;
        System.out.println("[" + getDeviceName() + "] Plug paired with 2.4GHz Wi-Fi: " + ssid);
    }

    @Override
    public boolean isConnected() {
        return connectedToWiFi;
    }

    @Override
    public void sendNotification(String message) {
        if (!connectedToWiFi) {
            System.err.println("[" + getDeviceName() + "] Offline! Notification dropped.");
            return;
        }
        System.out.println("[Plug Notification -> " + getDeviceName() + "]: " + message);
    }

    public void togglePower(boolean turnOn) {
        this.relayActive = turnOn;
        String state = turnOn ? "POWER ON" : "POWER OFF";
        System.out.println("[" + getDeviceName() + "] Mechanical Relay switched to: " + state);
        sendNotification("Socket state changed to " + state);
    }

    @Override
    public void getStatusSummary() {
        System.out.println("Plug Status -> WiFi: " + (connectedToWiFi ? "ONLINE" : "OFFLINE") 
                + " | Relay Power: " + (relayActive ? "ACTIVE" : "STANDBY"));
    }
}