package com.multilevel.usermanagement;

public class PremiumUser extends RegisteredUser {

    private final double subscriptionFee;

    public PremiumUser(String username,
                       String email,
                       double subscriptionFee) {

        super(username, email);

        if (subscriptionFee <= 0) {
            throw new IllegalArgumentException(
                    "Subscription fee must be positive");
        }

        this.subscriptionFee = subscriptionFee;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public double calculateAnnualFee() {

        if (!isActive()) {
            System.out.println(
                    "Premium features unavailable. Account is deactivated.");
            return 0;
        }

        return subscriptionFee * 12;
    }
}