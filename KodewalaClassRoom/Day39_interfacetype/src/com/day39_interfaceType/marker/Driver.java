package com.day39_interfaceType.marker;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account acc = new Account("Kodewala Academy", "BTM Bangalore", "78653241456");
		
		
		  Account clonedObjOfAcc = (Account) acc.clone(); // trying to clone(xerox / copy)
		  System.out.println(clonedObjOfAcc.accNo);
		 
		
		if(acc instanceof Cloneable)
		{
			System.out.println(" true.... allowed to perform the activity...");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
