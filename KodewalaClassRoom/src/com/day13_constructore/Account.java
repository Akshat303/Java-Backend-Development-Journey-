package com.day13_constructore;

public class Account {

	int amount;
	String name;

	Account() {
		System.out.println("Account()");
	}

	Account(int _amount, String _name) {

		this.amount = _amount;
		this.name = _name;

		System.out.println("Default Cons");
	}

}
