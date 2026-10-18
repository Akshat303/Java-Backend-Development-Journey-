package com.hierarchical.notification;

public class PushNotification extends Notification {

    public PushNotification(String deviceToken) {

        super(deviceToken);

        if (deviceToken.length() < 8) {
            throw new IllegalArgumentException(
                    "Invalid device token");
        }
    }

    @Override
    public void send() {
        System.out.println(
                "Push notification sent to token: "
                        + getRecipient());
    }
}