package com.day38_39_interface.basics;

//Outer interface containing nested Inner interface
interface Outer {
	interface Inner {
		void show();
	}
}

//Class implementing the nested interface using 'Outer.Inner' syntax
class Test implements Outer.Inner {
	@Override
	public void show() {
		System.out.println("Nested Interface Executed");
	}
}

public class SimpleNestedInterface {
	public static void main(String[] args) {
		// Create an instance and invoke the method
		Outer.Inner obj = new Test();
		obj.show();
	}
}
