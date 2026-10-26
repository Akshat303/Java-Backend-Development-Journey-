package com.kodewala.oops.polymorphism3;

public class PaymentProcessor 
{
  public void processPayment(Payment payment) // can accept any type of Payment(CreditCard, DebitCard etc) object
  {
	//  Payment payment = new NetBankingPayment();
	  payment.doPayment(); // Polymorphism  // Payment payment = new NetBankingPayment();
  }
}
