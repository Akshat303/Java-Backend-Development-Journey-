package com.kodewala.stringBuilderBuffer;

import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala"); // StringBuilder object --> mutable
		sb.append(" Academy");
		System.out.println(sb);

		/**
		 * 3 object created scp --> kodewala , Academy heap --> kodewala -> modified -
		 * kodewala Academy
		 * 
		 */
		
		for(int i = 0; i <10; i++) {
			sb.append(" Academy," + i);
		}
		System.out.println(sb);
	}

}
