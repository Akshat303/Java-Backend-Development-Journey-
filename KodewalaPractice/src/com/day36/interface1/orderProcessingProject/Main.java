package com.day36.interface1.orderProcessingProject;

public class Main {

	public static void process(OrderProcessor processor, double amount) {

		processor.processOrder(amount);
	}

	public static void main(String[] args) {

		OrderProcessor online = new OnlineOrderProcessor();
		OrderProcessor store = new StoreOrderProcessor(); 
		OrderProcessor mobile = new MobileOrderProcessor (); 

		// Valid orders
		process(online, 1500.0);
		process(store, 800.0);
		process(mobile, 250.0);

		// Invalid orders
		process(online, 0);
		process(store, -200.0);
		process(mobile, -20.0);
	}
}