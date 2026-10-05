package com.scan_while;

public class NetflixLogin {

    String correctUsername = "admin";
    String correctPassword = "12345";

    public void checkLogin(String username, String password) {

        while (!username.equals(correctUsername) ||
               !password.equals(correctPassword)) {

            System.out.println("Wrong Username or Password");
            return;
        }

        System.out.println("Login Successful!");
    }
}