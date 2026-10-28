class Account {
 int balance = 500;
 static int intRate = 5;
 
 public static void main (String args[]){
	// creating an object of account class
	
	Account acc = new Account ();
	System.out.println("Balance is : " + acc.balance);
	System.out.println("intRate is : " + Account.intRate);
	
 }
}