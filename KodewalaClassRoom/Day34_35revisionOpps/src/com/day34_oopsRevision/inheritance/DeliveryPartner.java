package com.day34_oopsRevision.inheritance;

public class DeliveryPartner extends Object {

	public void doDelivery() // 200 lines of code
	{
		System.out.println("DeliveryPartner.doDelivery()");
	}

}

class XpressBee extends DeliveryPartner {
	// can reuse here + can override the method of the parent class
	
	@Override
	public void doDelivery() {
		System.out.println("XpressBee.doDelivery(override)");
	}

}

class Ecart extends DeliveryPartner {
}