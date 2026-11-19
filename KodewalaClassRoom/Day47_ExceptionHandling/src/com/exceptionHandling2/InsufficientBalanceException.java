package com.exceptionHandling2;

public class InsufficientBalanceException extends RuntimeException
{

	public InsufficientBalanceException(String msg)
		{
			super(msg);
		}
}