package com.day40_serialization.transientKeyword;

import java.io.Serializable;

public class User implements Serializable {

	private String username;

	transient private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}