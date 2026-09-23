package com.constructor.practice;

public class StudentInfo {

	String stName;
	byte stAge;
	String course;
	int stMarks;

	StudentInfo() {
	}

	StudentInfo(String _stName, byte _stAge, String _course, int _stMarks) {

		this.stName = _stName;
		this.stAge = _stAge;
		this.course = _course;
		this.stMarks = _stMarks;
	}

	// Display Method

	// void display() {
//	System.out.println(stName);
//	System.out.println(stAge);
//	System.out.println(course);
//	System.out.println(stMarks);
//	}

	
	//Private
//	private void display() {
//		System.out.println(stName);
//		System.out.println(stAge);
//		System.out.println(course);
//		System.out.println(stMarks);
//	}
//	
//	public void showStudent() {
//		display();
//	}
	
	protected void display() {
		System.out.println(stName);
		System.out.println(stAge);
		System.out.println(course);
		System.out.println(stMarks);
	}
}
