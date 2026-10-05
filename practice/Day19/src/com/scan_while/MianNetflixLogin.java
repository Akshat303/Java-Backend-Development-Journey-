package com.scan_while;

import java.util.Scanner;

public class MianNetflixLogin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NetflixLogin login = new NetflixLogin();

		System.out.print("Enter Username: ");
		String username = sc.nextLine();

		System.out.print("Enter Password: ");
		String password = sc.nextLine();

		login.checkLogin(username, password);

		sc.close();
	}
}