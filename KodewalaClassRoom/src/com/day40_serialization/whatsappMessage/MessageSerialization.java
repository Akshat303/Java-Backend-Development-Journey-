package com.day40_serialization.whatsappMessage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization {

	public void serializeMsg(Message message) throws IOException {

		FileOutputStream fio = new FileOutputStream("message.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fio);

		oos.writeObject(message); // writing object

		oos.close(); // close connection
	}
}