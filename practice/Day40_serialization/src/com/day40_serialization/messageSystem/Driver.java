package com.day40_serialization.messageSystem;

public class Driver {

	public static void main(String[] args) throws Exception {

		Message msg = new Message("M101", "Hello", "Akshat");

		MessageSerialization ms = new MessageSerialization();

		ms.serializeMessage(msg);

		MessageDeserialization md = new MessageDeserialization();

		Message message = md.deserializeMessage();

		System.out.println("Message Id : " + message.getMessageId());

		System.out.println("Message : " + message.getMessage());

		System.out.println("Sender : " + message.getSender());
	}
}