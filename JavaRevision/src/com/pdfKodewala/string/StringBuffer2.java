package com.pdfKodewala.string;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Kodewala"); // scp, Heap

		str.append(", BTM"); // scp , update in heap str value
		str.append(", Bangalore"); // scp , update in heap str value
		System.out.println(str);

		// "Kodewala Academy" SCP Initial literal
		// ", BTM" SCP Literal appended
		// ", Bangalore" SCP Literal appended
		// StringBuffer("Kodewala Academy") Heap Mutable buffer object
		// sb.toString() result "Kodewala Academy, BTM, Bangalore" Heap Temporary string
		// for printing

//		Commonly use method of java StringBuffer class
		System.out.println(str.capacity());
		System.out.println(str.length());
		System.out.println(str.reverse());

		System.out.println("Length & Capacity");

		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // 4 + 16 = 20
		
//		---------------------------
        StringBuffer str4 = new StringBuffer("Java Backend Developer");

        str4.delete(5, 13);

        System.out.println(str4);
	}

}
