package com.akshat;

class InstanceVariable {
	int balance = 100;
	public static void name(String[] args) {
		InstanceVariable insVar = new InstanceVariable();
		System.out.println("Balance = " + insVar.balance );
		
	}

}
