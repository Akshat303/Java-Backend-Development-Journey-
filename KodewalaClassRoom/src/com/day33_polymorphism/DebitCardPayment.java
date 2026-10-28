package com.day33_polymorphism;

public class DebitCardPayment extends Payment 
{
	@Override
	public void doPayment() 
	{
		System.out.println("DebitCardPayment.doPayment()....... DebitCardPayment ");
	}

}
