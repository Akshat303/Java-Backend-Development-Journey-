package com.loop;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String fruit = in.nextLine();
		
		switch(fruit) {
		case "Mango" -> System.out.println("Mango"); 
		case "Apple" -> System.out.println("Apple"); 
		case "Orange" -> System.out.println("Orange"); 
		case "Grapes" -> System.out.println("Grapes"); 
		default -> System.out.println("Vaild enter");
		}

	}

}
