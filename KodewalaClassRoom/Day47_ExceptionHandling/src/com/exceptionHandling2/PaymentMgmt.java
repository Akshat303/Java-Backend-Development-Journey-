package com.exceptionHandling2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PaymentMgmt
{
	public void doPayment(String account, int amount) throws FundTransferException
	{
		// check the balance
		try
		{
			checkBalance(account, amount);
		}
		catch (NullPointerException | FileNotFoundException e)
		{ // java 7
			throw new FundTransferException(
					"You do not have enough balance OR " + "in case you have opend the account recently, "
							+ "please wait for 24rs before doing fund tranfer"
			);
		}

	}

	private boolean checkBalance(String account, int amount) throws InsufficientBalanceException, FileNotFoundException
	{
		boolean checkBalanceStatus = false;
		int balance = 1000; // from database
		if (amount > balance)
		{
			// balance is not enough
			throw new InsufficientBalanceException(
					account + " does not have enough balance and current balance is " + balance
			);
		}
		else
		{
			// allow to transfer fund
			checkBalanceStatus = true;
		}

		return checkBalanceStatus;
	}
}