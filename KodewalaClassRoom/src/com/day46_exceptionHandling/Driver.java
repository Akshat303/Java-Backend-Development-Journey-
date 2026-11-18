package com.day46_exceptionHandling;

// Exception Handling 
public class Driver {

	public static void main(String[] args) {
		Account account = new Account();
		String accNo = "SBI_23456734567"; //
		String address[] = {"BTM Bangalore", " JP Nagar Bangalore"};
		account.doActivateAcc(accNo, address);

	}

}

class Account {
	void doActivateAcc(String accNo, String address[]) {
		System.out.println("Account.doActivateAcc() START");
		validateAccDetails(accNo, address);

		System.out.println("Account.doActivateAcc() END");
	}

	public boolean validateAccDetails(String accNo, String address[]) {

		System.out.println("Account.validateAccDetails() START");

		System.out.println("Validating account details...");
		System.out.println("Checking account status...");

		int accountType = 1;
		String bankName = "State Bank of India";
		boolean isActive = true;

		System.out.println("Account Type: " + accountType);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Active: " + isActive);
		boolean isValid = false;
		try {
             String homeAddress =  address[1];
             System.out.println(" homeAddress : "+ homeAddress);
			isValid = accNo.startsWith("SBI"); // NPE if account number is null --> Is this risky code ?
			int amount = 100/0; // ArithmeticException 
            int accNoInt =  Integer.parseInt(accNo); // 
			
		} catch (NullPointerException e)  // Child
		{ // This block will catch any of the exception Object
			System.out.println(" Values is null");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) // Child
		{
			System.out.println(" You are trying to get an values from invalid index");
			e.printStackTrace();
		}
		catch (ArithmeticException e) { // Child
			System.out.println(" ArithmeticException .. number / by zero");
			e.printStackTrace();
		}
		
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails() END");

		return isValid;
	}
}
