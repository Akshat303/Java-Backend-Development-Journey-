package com.day33_polymorphism;

public class PaymentProcessor 
{
  public void processPayment(Payment payment) // can accept any type of Payment(CreditCard, DebitCard etc) object
  {
	//  Payment payment = new NetBankingPayment();
	  payment.doPayment(); // Polymorphism  // Payment payment = new NetBankingPayment();
  }
}
