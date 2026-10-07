package com.practice.login;

public class UserLoginSystem {



    private String username;
    private String password;

    // Constructor
    public UserLoginSystem(String _username, String _password) {
        this.username = _username;
        this.password = _password;
    }

    // Login business logic
    public String login(String enteredUsername, String enteredPassword) {

        if (!username.equals(enteredUsername)) {
            return "Invalid Username";
        } else if (!password.equals(enteredPassword)) {
            return "Wrong Password";
        } else {
            return "Login Successful";
        }
    }
}