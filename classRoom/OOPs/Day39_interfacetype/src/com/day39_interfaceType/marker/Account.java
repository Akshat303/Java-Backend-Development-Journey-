package com.day39_interfaceType.marker;

public class Account implements Cloneable // giving permission so that object of this class can be copied/cloned
{
  String name;
  String address;
  String accNo;
  
  public Account(String name, String address, String accNo) {
	super();
	this.name = name;
	this.address = address;
	this.accNo = accNo;
  }
  
  @Override
  public Object clone() throws CloneNotSupportedException
  {
	  return super.clone();
  }
  
}
