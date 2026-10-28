package com.day31_methodOverridingOverriding.Overriding;

public class Account {

	int minbalance = 1000;

	public String openAccount(String name, int intiBal) {
		// some.... 100 lines of code --> x
		System.out.println("Account.openAccount().......");
		return "Something";
	}
}

class SavinhAccount extends Account {

	// 1. Method name should be same
	// 2. Type, order and number of argument should be same
	// 3. Return type should be same except covariant
	// 4. Access modifier --> Should be same or widen(public)

	@Override // you are telling compiler that i am overriding the method , please check all
				// the rules

	public String openAccount(String name, int intiBal) {
		// some.... 234 lines of code --> x+1
		System.out.println("SavinhAccount.openAccount().......");
		return "Something overriding";
	}
}