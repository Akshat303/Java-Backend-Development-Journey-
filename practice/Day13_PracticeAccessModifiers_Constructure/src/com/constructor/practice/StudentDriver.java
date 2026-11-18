package com.constructor.practice;

public class StudentDriver {
	public static void main(String[] args) {

		String stName = args[0];
		byte stAge = Byte.parseByte(args[1]);
		String course = args[2];
		int stMarks = Integer.parseInt(args[3]);

		StudentInfo stDetails1 = new StudentInfo(stName, stAge, course, stMarks);
//		System.out.println(stDetails1.stName);
//		Default
		stDetails1.display();

		//Private
//		stDetails1.showStudent();

	}

}
