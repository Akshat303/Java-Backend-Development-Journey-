package com.day36.interface1.multipleInterfaces;

public class Machine implements Printable, Scannable {

	@Override
	public void scan() {
		System.out.println("Printing document");

	}

	@Override
	public void print() {
		System.out.println("Scanning document");

	}

}
