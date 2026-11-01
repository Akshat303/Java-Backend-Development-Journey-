package com.day38_practiceOOPs.notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Notification {
    private final String recipient;
    private final LocalDateTime timestamp;

    protected Notification(String recipient) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Recipient cannot be null or empty.");
        }
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getFormattedTimestamp() {
        return timestamp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Abstract methods: child channels enforce validation and dispatch
    protected abstract void validate(String message);
    public abstract void send(String message);
}