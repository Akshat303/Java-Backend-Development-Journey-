package com.day35_oopsRevision;

public class Driver {
	public static void main (String[] args) {
		
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		
		deliveryProcessor.processDelivery(new EKart());
		deliveryProcessor.processDelivery(new ExpressBee());
		deliveryProcessor.processDelivery(new Delivery());
		deliveryProcessor.processDelivery(new ShipRocket());
	}

}
