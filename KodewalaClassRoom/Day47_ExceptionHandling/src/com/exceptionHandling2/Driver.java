package com.exceptionHandling2;

public class Driver
{

	public static void main(String[] args)
	{
		System.out.println("Driver.main() START ");
		PaymentMgmt mgmt = new PaymentMgmt();

		try
		{
			mgmt.doPayment("12345675432", 1200);
		}
		catch (FundTransferException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Driver.main() END ");
	}

}