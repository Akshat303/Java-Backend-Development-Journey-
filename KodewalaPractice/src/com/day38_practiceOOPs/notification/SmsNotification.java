package com.day38_practiceOOPs.notification;

public class SmsNotification extends Notification {
    private static final int MAX_SMS_LENGTH = 160;

    public SmsNotification(String mobileNumber) {
        super(mobileNumber);
        // Validates standard 10-digit format (or with optional country code)
        if (!mobileNumber.matches("^\\+?[0-9]{10,13}$")) {
            throw new IllegalArgumentException("Invalid phone number format: " + mobileNumber);
        }
    }

    @Override
    protected void validate(String message) {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("SMS text cannot be empty.");
        }
        if (message.length() > MAX_SMS_LENGTH) {
            throw new IllegalArgumentException(
                "SMS length exceeds maximum allowed character limit (" + MAX_SMS_LENGTH + " chars)."
            );
        }
    }

    @Override
    public void send(String message) {
        validate(message);
        System.out.println("[SMS DISPATCHED]");
        System.out.println("  Mobile No : " + getRecipient());
        System.out.println("  Time      : " + getFormattedTimestamp());
        System.out.println("  Content   : " + message);
        System.out.println("  Status    : Delivered via Telecom SMS Gateway\n");
    }
}