package com.modifire.package2;

import com.modifire.package1.StudentPublic;

public class TestPublic {
	public static void main(String[] args) {

		StudentPublic stuName = new StudentPublic();
//		Rule Public Anywhere
		System.out.println("Test " + stuName.name); // name public hai student.java file mai
		stuName.display(); // display public hai student.java file mai
	}

}
