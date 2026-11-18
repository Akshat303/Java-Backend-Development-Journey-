package com.hierarchical.notification;

public abstract class Notification {

    private final String recipient;

    public Notification(String recipient) {

        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException(
                    "Recipient cannot be empty");
        }

        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public abstract void send();
}