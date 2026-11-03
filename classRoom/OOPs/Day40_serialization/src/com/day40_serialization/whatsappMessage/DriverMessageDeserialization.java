package com.day40_serialization.whatsappMessage;

import java.io.IOException;

public class DriverMessageDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		MessageDeserialization md = new MessageDeserialization();

		Message msg = md.deserializeMsg();

		System.out.println("Message Id : " + msg.getMessageId());

		System.out.println("Message : " + msg.getMessage());
	}
}