package com.learning.modifier;

//private public class A {
//
//	int a = 5;
//}

 class C {
	private int c =5;
	
	public int getC() {
		return c;
	}
}

class A {
	
	C obj = new C();
	
	int a = 12;
}
