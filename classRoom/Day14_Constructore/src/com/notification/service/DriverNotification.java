package com.notification.service;

public class DriverNotification {
	public static void main(String[] args) {

		NotificationService notifi = new NotificationService();
		notifi.sendNotification("sms");
		notifi.sendNotification("email");
		notifi.sendNotification("whatapp");
	}

}
