package com.day38_practiceOOPs.notification;

import java.util.List;
import java.util.Objects;

public class NotificationDispatcher {

    public void dispatchBroadcast(List<Notification> channels, String alertMessage) {
        Objects.requireNonNull(channels, "Channels list cannot be null.");
        System.out.println("================ BROADCAST DISPATCH STARTED ================\n");

        for (Notification channel : channels) {
            try {
                channel.send(alertMessage);
            } catch (Exception ex) {
                System.err.println("Failed to send notification to " 
                        + channel.getRecipient() + ": " + ex.getMessage() + "\n");
            }
        }

        System.out.println("================ BROADCAST DISPATCH COMPLETED ================");
    }
}