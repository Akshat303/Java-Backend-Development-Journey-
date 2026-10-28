package com.day33_polymorphism.task;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) // Object obj = new Person("shreya");  
	{
		Person p = (Person) obj;	
		return p.name.equals(this.name);
	}

}

public class Driver

{
	public static void main(String[] args) 
	{
		Person p1 = new Person("shreya"); // one obj on heap.. xyz
		Person p2 = new Person("shreya"); // another obj on heap add is abc
		System.out.println(p1.equals(p2)); // false 
	}
}
