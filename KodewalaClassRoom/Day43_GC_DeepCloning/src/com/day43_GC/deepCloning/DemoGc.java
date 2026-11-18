package com.day43_GC.deepCloning;

public class DemoGc {

	static String name;
	int age;

	public static void main(String[] args) {
		name = "Akshat";
		System.out.println(name);

		
		name = null;
		System.out.println(name);
	}

}
