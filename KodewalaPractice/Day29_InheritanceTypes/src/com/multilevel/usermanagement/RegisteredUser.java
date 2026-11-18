package com.multilevel.usermanagement;

public class RegisteredUser extends User {

    private final String email;
    private boolean active;

    public RegisteredUser(String username, String email) {

        super(username);

        validateEmail(email);

        this.email = email;
        this.active = true;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public void deactivateAccount() {
        active = false;
    }

    private static void validateEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                    "Email cannot be empty");
        }
    }
}