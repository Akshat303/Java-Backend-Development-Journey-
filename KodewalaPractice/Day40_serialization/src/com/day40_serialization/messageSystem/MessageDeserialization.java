package com.day40_serialization.messageSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MessageDeserialization {

	public Message deserializeMessage() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("message.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Message message = (Message) ois.readObject();

		ois.close();

		return message;
	}
}