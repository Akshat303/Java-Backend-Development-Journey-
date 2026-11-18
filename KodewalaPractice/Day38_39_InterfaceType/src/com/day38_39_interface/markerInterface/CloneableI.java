package com.day38_39_interface.markerInterface;

//Define a class that implements the Cloneable marker interface
class Student implements Cloneable {
}

public class CloneableI {

	public static void main(String[] args) {
		Student s = new Student();

		// Check if the object is an instance of the Cloneable marker interface
		System.out.println(s instanceof Cloneable); // Output: true
		
//		Marker Interface ka naam kya hai? = Cloneable

	}

}
