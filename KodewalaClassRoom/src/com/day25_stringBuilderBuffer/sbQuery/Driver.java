package com.day25_stringBuilderBuffer.sbQuery;

public class Driver {

	public static void main(String[] args) {
		
		QueryGenerator gen = new QueryGenerator();
		StringBuilder result = gen.generateQuery(12345, "Emo1");
		
		System.out.println(result);

	}

}
