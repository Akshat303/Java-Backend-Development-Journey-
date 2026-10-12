package com.string.practice;

public class StringInvestigation {

	public void runAnalysis() {
		String a = "Java";
		String b = "Java";
		String c = new String("Java");
		String d = new String("Java");

		String e = a.concat(" Developer");
		String f = "Java" + " Developer";
		String g = c.concat(" Developer");

		StringBuilder h = new StringBuilder("Java");
		h.append(" Developer");

		String i = h.toString();
		String j = i.intern();

		// 1. == Comparisons
		System.out.println("a == b: " + (a == b)); // true (same pool reference)
		System.out.println("a == c: " + (a == c)); // false (pool vs heap)
		System.out.println("c == d: " + (c == d)); // false (two distinct heap objects)
		System.out.println("e == f: " + (e == f)); // false (runtime concat vs compile-time constant)
		System.out.println("e == g: " + (e == g)); // false (different runtime objects)
		System.out.println("f == j: " + (f == j)); // true (both point to pool reference "Java Developer")
		System.out.println("i == j: " + (i == j)); // false unless interned string already equals i

		// 2. equals() comparisons
		System.out.println("a.equals(c): " + a.equals(c)); // true
		System.out.println("e.equals(f): " + e.equals(f)); // true
		System.out.println("e.equals(g): " + e.equals(g)); // true
		System.out.println("i.equals(j): " + i.equals(j)); // true

		// 3. Identity Hash Codes
		System.out.println("Identity Hash Codes:");
		System.out.println("a: " + System.identityHashCode(a));
		System.out.println("b: " + System.identityHashCode(b));
		System.out.println("c: " + System.identityHashCode(c));
		System.out.println("d: " + System.identityHashCode(d));
		System.out.println("e: " + System.identityHashCode(e));
		System.out.println("f: " + System.identityHashCode(f));
		System.out.println("g: " + System.identityHashCode(g));
		System.out.println("i: " + System.identityHashCode(i));
		System.out.println("j: " + System.identityHashCode(j));
	}
}
