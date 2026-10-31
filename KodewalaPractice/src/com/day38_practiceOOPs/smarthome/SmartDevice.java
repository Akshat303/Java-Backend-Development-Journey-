package com.day38_practiceOOPs.smarthome;

public abstract class SmartDevice {
    private final String deviceId;
    private final String deviceName;

    protected SmartDevice(String deviceId, String deviceName) {
        if (deviceId == null || deviceId.isBlank()) {
            throw new IllegalArgumentException("Device ID cannot be empty.");
        }
        if (deviceName == null || deviceName.isBlank()) {
            throw new IllegalArgumentException("Device Name cannot be empty.");
        }
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public abstract void getStatusSummary();
}