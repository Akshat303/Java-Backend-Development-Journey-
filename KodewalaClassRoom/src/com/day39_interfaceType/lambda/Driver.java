package com.day39_interfaceType.lambda;

public class Driver {
	public static void main (String[] args) {
		
		IAccount acc = () ->  // -> lambda expression symbol
		{
			System.out.println("Driver.main()..... Opening Accont");
		};
		
		acc.openAccount();
	}

}
