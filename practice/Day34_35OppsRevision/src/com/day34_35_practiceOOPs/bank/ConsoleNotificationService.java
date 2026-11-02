package com.day34_35_practiceOOPs.bank;

public class ConsoleNotificationService implements NotificationService {
	@Override
	public void sendNotification(String recipient, String message) {
		System.out.println("[Notification -> " + recipient + "]: " + message);
	}
}