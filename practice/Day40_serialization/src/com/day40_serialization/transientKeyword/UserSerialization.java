package com.day40_serialization.transientKeyword;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerialization {

	public void serializeUser(User user) throws IOException {

		FileOutputStream fos = new FileOutputStream("user.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(user);

		oos.close();
	}
}
