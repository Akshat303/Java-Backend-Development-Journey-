package com.day45_exceptionHandling;
//Not Exception Handling 
public class Driver2 {

	public static void main(String[] args) {
		Account2 acc1 = new Account2();
		String accNo = null;
//		String accNo = "3456789";
		acc1.doAcctivateAcc(accNo);

	}

}

class Account2 {
	void doAcctivateAcc(String accNo) {
		System.out.println("Account.doAcctivateAcc()...START");
		validateAccDetails(accNo);
		System.out.println("Account No. " + accNo);
		System.out.println("Account.doAcctivateAcc()....END");
	}
	
	private boolean validateAccDetails(String accNo) {
		System.out.println("Account.validateAccDetails()...START");
		
		boolean isValid = accNo.startsWith("SBI");
		System.out.println("Account.validateAccDetails()....END");
		return isValid;
	}
}
