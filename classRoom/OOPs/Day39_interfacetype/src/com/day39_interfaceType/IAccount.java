package com.day39_interfaceType;

//@FunctionalInterface
public interface IAccount extends IAccountMgmt {

	// Only one abstract method + one abstract method from IAccountMgmt, so this is not FunctionalInterface
	
	void openAccount(); // only one abstract method - SAM, by default is abstract
	// if only one abstract method , and other method is also available this is also FunctionalInterface

	default void addBeni() 
	{
		
	}

}
