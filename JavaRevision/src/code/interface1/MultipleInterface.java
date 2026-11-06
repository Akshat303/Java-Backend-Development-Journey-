package code.interface1;

interface A {
	public void fun();
}

interface B extends A {

	default void fun() {
		System.out.println("B.fun()");
	}
}

interface C extends A {
	default void fun() {
		System.out.println("C.fun()");
	}
}

class D implements B, C {

	@Override
	public void fun() {
		B.super.fun(); // call B
		C.super.fun(); // Call C
		System.out.println("D.fun()....override...");
	}

}

public class MultipleInterface {

	public static void main(String[] args) {
		D d = new D();
		d.fun();

	}

}
