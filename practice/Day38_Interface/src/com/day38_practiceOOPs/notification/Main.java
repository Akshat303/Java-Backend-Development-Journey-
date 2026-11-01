package com.day38_practiceOOPs.notification;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationDispatcher dispatcher = new NotificationDispatcher();

        // Heterogeneous polymorphic list: List<Notification> holding different subclasses
        List<Notification> notificationChannels = List.of(
            new EmailNotification("akshat.dev@example.com", "Security Alert: Login from New Device"),
            new SmsNotification("+919876543210"),
            new PushNotification("fcm_token_akshat_vivo_t4x_device_90112", "HIGH")
        );

        String alertMessage = "Your OTP for two-factor verification is 782910. Valid for 5 minutes.";

        // Unified polymorphic call across all channels
        dispatcher.dispatchBroadcast(notificationChannels, alertMessage);

        // Verification of validation failure: SMS length overflow
        System.out.println("\nTesting SMS Character Limit Exception:");
        try {
            SmsNotification testSms = new SmsNotification("+919876543210");
            String hugeMessage = "A".repeat(165);
            testSms.send(hugeMessage);
        } catch (IllegalArgumentException ex) {
            System.err.println("Expected Validation Caught: " + ex.getMessage());
        }
    }
}