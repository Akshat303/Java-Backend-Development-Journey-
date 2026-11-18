package com.day41_markerInterface;

public class Driver {
	
	public static void main(String[] args) {
		
		User user1 = new User("KW123","Kodewala");
		
		DataCleaner cleaner = new DataCleaner();
//		cleaner.clean(cleaner);
		cleaner.clean(user1);
		
	}

}
