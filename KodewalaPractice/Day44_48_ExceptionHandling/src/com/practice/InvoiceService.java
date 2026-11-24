package com.practice;

public class InvoiceService
{

	public void generateInvoice()
	{
		// Get customers and order details from database
		// [Connect with database --> create db connection] +
		// [get details from db]
		try
		{
			connectDatabase(); // creating connection
			String name = "fgh";
			name.lastIndexOf("a");
			System.out.println(" Generating an invoices....");
			// closing
//			System.exit(0); // killing JVM
			closeDbConnection();
		}
		catch (Exception e)
		{
			System.out.println(" some exception");
			e.printStackTrace();
		}
		finally
		{ // mandatory executable block (Exception OR No Exception)
			System.out.println(" I am inside finally block...");

		}
	}

	private void connectDatabase() // Connection Object
	{
		System.out.println(" Connecgting to DB");
	}

	private void closeDbConnection()
	{
		System.out.println(" Closing connection...");
	}

}
