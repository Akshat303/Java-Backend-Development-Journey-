package com.notification.service;

public class NotificationService {

	public void sendNotification(String _type) {
		System.out.println("Noyification.sendNotification");

		if (_type.equalsIgnoreCase("sms")) {
			sendSms();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatapp();
		}
	}

	private void sendSms() {
		System.out.println("NotificationService.sendSms() START");

		// logic
		System.out.println("NotificationService.sendSms() END");
	}

	private void sendEmail() {
		System.out.println("NotificationService.sendEmail() START");

		// logic
		System.out.println("NotificationService.sendEmail() END");
	}

	private void sendWhatapp() {
		System.out.println("NotificationService.sendWhatapp() START");

		// logic
		System.out.println("NotificationService.sendWhatapp() END");
	}
}
