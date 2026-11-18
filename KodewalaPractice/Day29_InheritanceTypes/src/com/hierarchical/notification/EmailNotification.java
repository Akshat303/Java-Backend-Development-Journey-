package com.hierarchical.notification;

public class EmailNotification extends Notification {

    public EmailNotification(String email) {

        super(email);

        if (!email.contains("@")) {
            throw new IllegalArgumentException(
                    "Invalid email address");
        }
    }

    @Override
    public void send() {
        System.out.println(
                "Email sent to: " + getRecipient());
    }
}