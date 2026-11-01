package com.day38_practiceOOPs.notification;

public class PushNotification extends Notification {
    private final String priority; // e.g., HIGH, NORMAL

    public PushNotification(String deviceToken, String priority) {
        super(deviceToken);
        if (deviceToken.length() < 12) {
            throw new IllegalArgumentException("Invalid FCM/APNS device token length.");
        }
        this.priority = (priority == null || priority.isBlank()) ? "NORMAL" : priority.toUpperCase();
    }

    @Override
    protected void validate(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Push notification payload cannot be empty.");
        }
    }

    @Override
    public void send(String message) {
        validate(message);
        System.out.println("[PUSH NOTIFICATION DISPATCHED]");
        System.out.println("  Device Token : " + getRecipient());
        System.out.println("  Priority     : " + priority);
        System.out.println("  Time         : " + getFormattedTimestamp());
        System.out.println("  Payload      : " + message);
        System.out.println("  Status       : Pushed via Firebase Cloud Messaging (FCM)\n");
    }
}