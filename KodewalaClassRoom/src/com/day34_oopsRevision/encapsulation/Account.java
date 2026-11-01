package com.day34_oopsRevision.encapsulation;

public class Account {

//	public int balance; ❌

	private int balance;
	private String mobileNo;

	// This method modify the balance
	public void credit() {

		// Check the balance of sender
		// Check the pin of sender
		// debit the amount
		// credit the amount --> 0 -----> 100
		System.out.println("Account.credit().... doing fund transfer");
	}

	/**
	 * @return the balance check
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the mobile no
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * @return the set mobile no
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
