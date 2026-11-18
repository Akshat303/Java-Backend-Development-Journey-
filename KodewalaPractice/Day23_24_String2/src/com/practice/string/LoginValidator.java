package com.practice.string;

public class LoginValidator {

	private String storedUsername;
	private String storedPassword;

	public LoginValidator(String _storedUsername, String _storedPassword) {
		this.storedUsername = _storedUsername;
		this.storedPassword = _storedPassword;
	}

	public boolean validateUsername(String enteredUsername) {
		return storedUsername.equals(enteredUsername);
	}

	public boolean validatePassword(String enteredPassword) {
		return storedPassword.equals(enteredPassword);
	}

	public boolean validateLogin(String enteredUsername, String enteredPassword) {

		boolean usernameValid = validateUsername(enteredUsername);
		boolean passwordValid = validatePassword(enteredPassword);

		return usernameValid && passwordValid;
	}
}