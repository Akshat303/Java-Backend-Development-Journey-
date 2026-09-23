package com.modifire.package1;

public class StudentPrivate {

//Private --> sirf same class ke ander access kar sakye

	private String namePrivate = "Akshat Private"; // private

	private void displayPrivate() { // private
		System.out.println("Name - " + namePrivate);
	}

	public static void main(String[] args) {
		StudentPrivate stNamePrivate = new StudentPrivate();
		System.out.println("Private " + stNamePrivate.namePrivate);
		System.out.println("Private " + stNamePrivate);
		stNamePrivate.displayPrivate();
	}
	
	//Private variable dusre class mai access keliye
	
	private String varName = "Abhi";
	public void setName(String _varName) {
		this.varName = _varName;
	}
	public String  getName() {
		return varName ;
	}

}