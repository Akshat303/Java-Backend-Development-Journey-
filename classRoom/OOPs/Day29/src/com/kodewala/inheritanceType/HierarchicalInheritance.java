package com.kodewala.inheritanceType;


class University {
	public void UniversityInfo(String UniversityName, String address) {
		System.out.println("University.UniversityInfo()");
	}
}

class CollageOne extends University {
	@Override
	public void UniversityInfo(String UniversityName, String address) {
		System.out.println("CollageOne.UniversityInfo()");
	}
}

class CollageTwo extends University {
	@Override
	public void UniversityInfo(String UniversityName, String address) {
		System.out.println("StudentDetails.CollageInfo()");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		
	}

}
