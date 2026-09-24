package com.kodewala.day14;

class Invoice extends Object {

	static int gst = 18;

	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}

	void display() {
		System.out.println("Amount = " + amount);
		System.out.println("Item Name = " + itemName);
		System.out.println("Addrss = " + billingAddress);
		System.out.println("C-Id = " + customerId);
		System.out.println("C-Name = " + customerName);
		System.out.println("GST = " + gst);
	}
}

public class Driver {

	public static void main(String[] args) {
		Invoice inc1 = new Invoice(2500, "Mobile", "Bangalore", "Ak1235", "Akshat");
		Invoice inc2 = new Invoice(500, "Apple", "Bangalore", "Ra1235", "Amit");

//		System.out.println("Amount = " + inc1.amount + "Item Name = " + inc1.itemName + "Addrss = " + inc1.billingAddress+ "C-Id = " + inc1.customerId + "C-Name = " + inc1.customerName + " gst = " + inc1.gst);
		inc1.display();
		inc2.display();
	}

}
