package com.day40_serialization.whatsappMessage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MessageDeserialization {

	public Message deserializeMsg() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("message.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Message message = (Message) ois.readObject(); // reading object

		ois.close();

		return message;
	}
}