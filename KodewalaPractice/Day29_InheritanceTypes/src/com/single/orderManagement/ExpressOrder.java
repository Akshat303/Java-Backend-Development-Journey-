package com.single.orderManagement;

public class ExpressOrder extends Order {

    private final double deliveryCharge;

    public ExpressOrder(String orderId,
                        double orderAmount,
                        double deliveryCharge) {

        super(orderId, orderAmount);

        validateDeliveryCharge(deliveryCharge);
        this.deliveryCharge = deliveryCharge;
    }

    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + deliveryCharge;
    }

    private static void validateDeliveryCharge(double deliveryCharge) {
        if (deliveryCharge < 0) {
            throw new IllegalArgumentException(
                    "Delivery charge cannot be negative");
        }
    }
}