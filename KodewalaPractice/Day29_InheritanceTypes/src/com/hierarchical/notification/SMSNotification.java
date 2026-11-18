package com.hierarchical.notification;

public class SMSNotification extends Notification {

    public SMSNotification(String phoneNumber) {

        super(phoneNumber);

        if (!phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException(
                    "Phone number must contain exactly 10 digits");
        }
    }

    @Override
    public void send() {
        System.out.println(
                "SMS sent to: " + getRecipient());
    }
}