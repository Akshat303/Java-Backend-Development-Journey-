package com.day39_interfaceType.lambda;

public class Driver2 {
	
	public static void main (String[] args) {
		
		IAccount2 acc =(name, address,amt)->{
			System.out.println("Driver2.main().... Opening Account... for " + name);
			return "Account opened";
			
		};
		String result = acc.openAccount("Kodewala", "BTM, Bangalore", 1000);
	}

}
