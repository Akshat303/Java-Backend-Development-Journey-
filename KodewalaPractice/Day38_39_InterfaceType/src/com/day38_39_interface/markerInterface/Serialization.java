package com.day38_39_interface.markerInterface;

import java.io.Serializable;

//Class implementing the Serializable marker interface
class Employee implements Serializable {
}

public class Serialization {

	public static void main(String[] args) {
		Employee emp = new Employee();

		// Check if emp is an instance of the Serializable interface
		System.out.println(emp instanceof Serializable); // Output: true
		
//		Serializable kis type ka interface hai? = Marker Interface
	}

}
