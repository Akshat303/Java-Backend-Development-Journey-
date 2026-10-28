package com.day26_object;

class AccountMgmt {

	public AccountMgmt() {
		System.out.println("Account mangt ()....");
	}
}

public class Account extends AccountMgmt {

	String accountNo;
	{
		System.out.println("Account IIB");

	}

	public Account(String _accountNo) {

		super();
		System.out.println("Account String no");
		this.accountNo = _accountNo;

	}
}
