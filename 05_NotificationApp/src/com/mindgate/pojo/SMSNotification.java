package com.mindgate.pojo;

import com.mindagte.service.Notification;

public class SMSNotification implements Notification {
	public void sendNotification(String to, String message) {
		System.out.println("Sending SMS Notification");
		System.out.println("To ::" + to);
		System.out.println("Message ::" + message);
	}
}
