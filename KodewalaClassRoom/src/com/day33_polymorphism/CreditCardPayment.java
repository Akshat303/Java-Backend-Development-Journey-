package com.day33_polymorphism;

public class CreditCardPayment  extends Payment
{
	@Override
	 public void doPayment()
	   {
		   System.out.println("CreditCardPayment.doPayment()....... CreditCardPayment ");
	   }
}
