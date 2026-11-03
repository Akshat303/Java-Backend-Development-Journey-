package com.day40_serialization.transientKeyword;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserDeserialization {

	public User deserializeUser() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("user.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		User user = (User) ois.readObject();

		ois.close();

		return user;
	}
}