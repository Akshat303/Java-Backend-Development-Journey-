package com.day29_oopsInheritance.inheritanceType;


class Collage {
	public void CollageInfo(String collageName, String address) {
		System.out.println("Collage.collageAdmission()");
	}
}

class CollageBranch extends Collage {
	@Override
	public void CollageInfo(String collageName, String address) {
		System.out.println("CollageBranch.CollageInfo()");
	}
}

class StudentDetails extends CollageBranch {
	@Override
	public void CollageInfo(String collageName, String address) {
		System.out.println("StudentDetails.CollageInfo()");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
	}

}
