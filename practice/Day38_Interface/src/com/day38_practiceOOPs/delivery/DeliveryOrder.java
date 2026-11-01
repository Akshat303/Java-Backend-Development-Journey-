package com.day38_practiceOOPs.delivery;

public class DeliveryOrder {
    private final String orderId;
    private final double distanceKm;
    private final boolean peakHour;

    public DeliveryOrder(String orderId, double distanceKm, boolean peakHour) {
        if (orderId == null || orderId.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be blank.");
        }
        if (distanceKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        this.orderId = orderId;
        this.distanceKm = distanceKm;
        this.peakHour = peakHour;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public boolean isPeakHour() {
        return peakHour;
    }
}