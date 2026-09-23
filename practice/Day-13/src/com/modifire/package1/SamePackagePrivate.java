package com.modifire.package1;

public class SamePackagePrivate {

//Private Same Package ki doosri class  {Not working because im try Private access in another class}

	public static void main(String[] args) {
		StudentPrivate stName = new StudentPrivate();
		System.out.println("SamePackage --> " + stName.namePrivate);

		stName.displayPrivate();
	}

}

/*Error:
The field StudentPrivate.namePrivate is not visible
The method displayPrivate() is not visible

Because:
private
↓
Only Same Class */