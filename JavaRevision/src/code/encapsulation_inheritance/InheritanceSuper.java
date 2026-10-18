package code.encapsulation_inheritance;

public class InheritanceSuper {

	public static void main(String[] args) {

		B s1 = new B();
		s1.collageAddress();

		C s2 = new C();
		s2.collageAddress();

		s2.eat();

	}

}

class A {
	void collageAddress() {
		System.out.println("Parent Class - Bangalore");
	}

	void eat() {
		System.out.println(" i am eating from class A ");
	}
}

class B extends A {
	void collageAddress() {
		System.out.println("Class B - Ahmedabad");
//		super.collageAddress();
	}
}

class C extends B {
	void collageAddress() {
		System.out.println(" i will call my seniro ");
		super.collageAddress();
		System.out.println("class C - Ranchi");

	}

	void eat() {
		System.out.println(" i am eating form class C");
		super.eat();
	}
}