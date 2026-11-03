package com.practice.string;

public class StringObjectChallenge {

	private String a;
	private String b;
	private String c;
	private String d;

	private String e;
	private String f;
	private String g;

	public StringObjectChallenge() {

		a = "Java";
		b = "Java";
		c = new String("Java");
		d = new String("Java");

		e = a.concat(" Developer");
		f = "Java" + " Developer";
		g = c.concat(" Developer");
	}

	public void displayValues() {

		System.out.println("----- String Values -----");

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
	}

	public void compareStrings() {

		System.out.println("\n----- == Comparisons -----");

		System.out.println("a == b : " + (a == b));
		System.out.println("a == c : " + (a == c));
		System.out.println("c == d : " + (c == d));

		System.out.println("e == f : " + (e == f));
		System.out.println("e == g : " + (e == g));
		System.out.println("f == g : " + (f == g));

		System.out.println("\n----- equals() Comparisons -----");

		System.out.println("a.equals(b) : " + a.equals(b));
		System.out.println("a.equals(c) : " + a.equals(c));
		System.out.println("c.equals(d) : " + c.equals(d));

		System.out.println("e.equals(f) : " + e.equals(f));
		System.out.println("e.equals(g) : " + e.equals(g));
		System.out.println("f.equals(g) : " + f.equals(g));
	}

	public void displayIdentityHashCodes() {

		System.out.println("\n----- identityHashCode() -----");

		System.out.println("a : " + System.identityHashCode(a));
		System.out.println("b : " + System.identityHashCode(b));
		System.out.println("c : " + System.identityHashCode(c));
		System.out.println("d : " + System.identityHashCode(d));
		System.out.println("e : " + System.identityHashCode(e));
		System.out.println("f : " + System.identityHashCode(f));
		System.out.println("g : " + System.identityHashCode(g));
	}

	public void checkImmutability() {

		System.out.println("\n----- String Immutability -----");

		System.out.println("Original a = " + a);

		a.concat(" Developer");

		System.out.println("After a.concat(\" Developer\") = " + a);

		System.out.println("\nconcat() does not change the original String.");
	}
}
