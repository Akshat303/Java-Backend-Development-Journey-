package com.day38_practiceOOPs.notification;

import java.util.regex.Pattern;

public class EmailNotification extends Notification {
    private static final Pattern EMAIL_REGEX = 
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    
    private final String subject;

    public EmailNotification(String recipientEmail, String subject) {
        super(recipientEmail);
        if (!EMAIL_REGEX.matcher(recipientEmail).matches()) {
            throw new IllegalArgumentException("Invalid email format: " + recipientEmail);
        }
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Email subject cannot be empty.");
        }
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    protected void validate(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Email body cannot be empty.");
        }
    }

    @Override
    public void send(String message) {
        validate(message);
        System.out.println("[EMAIL DISPATCHED]");
        System.out.println("  To       : " + getRecipient());
        System.out.println("  Time     : " + getFormattedTimestamp());
        System.out.println("  Subject  : " + subject);
        System.out.println("  Body     : " + message);
        System.out.println("  Status   : Sent via SMTP Gateway\n");
    }
}