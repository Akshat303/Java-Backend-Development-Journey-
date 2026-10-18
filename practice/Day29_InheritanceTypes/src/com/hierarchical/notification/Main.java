package com.hierarchical.notification;

public class Main {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("akshat@gmail.com"),
                new SMSNotification("9876543210"),
                new PushNotification("ABC123XYZ")
        };

        for (Notification notification : notifications) {

            System.out.println(
                    notification.getClass()
                            .getSimpleName());

            notification.send();

            System.out.println("--------------------");
        }
    }
}