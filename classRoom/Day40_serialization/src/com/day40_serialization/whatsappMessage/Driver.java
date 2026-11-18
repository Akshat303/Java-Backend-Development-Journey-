package com.day40_serialization.whatsappMessage;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("M101", "Hello Java Serialization");

		MessageSerialization ms = new MessageSerialization();

		ms.serializeMsg(msg);

		System.out.println("Object Serialized Successfully...");
	}
}