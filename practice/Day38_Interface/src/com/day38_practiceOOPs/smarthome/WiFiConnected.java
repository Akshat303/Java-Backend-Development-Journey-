package com.day38_practiceOOPs.smarthome;

public interface WiFiConnected {
    void connectToInternet(String ssid, String password);
    boolean isConnected();
    void sendNotification(String message);
}