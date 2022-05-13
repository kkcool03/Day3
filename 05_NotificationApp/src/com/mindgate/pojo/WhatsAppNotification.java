package com.mindgate.pojo;

import com.mindagte.service.Notification;

public class WhatsAppNotification implements Notification {
	public void sendNotification(String to, String message) {
		System.out.println("Sending WhatsApp Notification");
		System.out.println("To ::" + to);
		System.out.println("Message ::" + message);
	}

}
