package com.day30_abstraction.task;

public class OrderManagement {

	public static void main(String[] args) {

		Order myOrder = new Order("ORD101", 2500);

		OrderService orderService = new OrderService();

		boolean status = orderService.placeOrder(myOrder);

		System.out.println("Order Status : " + status);
	}
}