package com.day35_oopsRevision.polymorphism;

class Delivery {
	public void doDelivery() {
		System.out.println("Delivery.doDelivery().....");
	}
}

class ExpressBee extends Delivery {
//	@Override
//	public void doDelivery() {
//		System.out.println("ExpressBee.doDelivery()");
//	}
}

class EKart extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("EKart.doDelivery()");
	}
}

public class Main {

	public static void main(String[] args) {

		Delivery delivery = new Delivery();

		// compile time --> it will check the method in delivery class
		// runtime --> it will call the method of delivery class

		delivery.doDelivery();
		delivery.hashCode(); // method is not available in sub class then call the super class method

		System.out.println(delivery.hashCode());

		Delivery delivery2 = new ExpressBee();
		delivery2.doDelivery();

		Delivery delivery3 = new EKart();
		delivery3.doDelivery();

	}

}
