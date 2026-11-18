package com.multilevel.usermanagement;

public class User {

    private final String username;

    public User(String username) {
        validateUsername(username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    private static void validateUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException(
                    "Username cannot be empty");
        }
    }
}