package com.modifire.package1;

public class SamePackagePublic {
	
	public static void main(String[] args) {
		StudentPublic stName = new StudentPublic();
		System.out.println("SamePackage --> " + stName.name);
		
		stName.display();
	}

}
