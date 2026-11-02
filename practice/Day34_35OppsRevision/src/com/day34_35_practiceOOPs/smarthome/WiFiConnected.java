package com.day34_35_practiceOOPs.smarthome;

public interface WiFiConnected {
    void connectToInternet(String ssid, String password);
    boolean isConnected();
    void sendNotification(String message);
}