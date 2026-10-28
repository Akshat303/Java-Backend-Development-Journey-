package com.day29_oopsInheritance.inheritanceType;

class College {
	public void CollageInfo(String collageName, String address) {
		System.out.println("Collage.collageAdmission()");
	}
}

class CollegeBranch extends College {
	@Override
	public void CollageInfo(String collageName, String address) {
		System.out.println("CollageBranch.CollageInfo()");
		System.out.println(" Collage Name " + collageName + "\n Address " +address);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		
		CollegeBranch branch1 = new CollegeBranch();
		branch1.CollageInfo("CSE", "Bangalore");
		
	}

}
