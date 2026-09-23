package com.modifire.package1;

public class SamePackageProtected {

	public static void main(String[] args) {
		StudentProtected stName = new StudentProtected();
		System.out.println(stName.name);
		stName.display();

	}

}

/*

				Different package + inheritance
				
				package1
				    ↓
				Student
				package2
				    ↓
				ChildProtected

*/