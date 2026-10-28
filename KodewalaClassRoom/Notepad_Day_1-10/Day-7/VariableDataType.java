class Payment 
{
	int totalBalance = 2100; // instance variable --> belongs to object
	
	static int maxAmount = 1000; //Static variable --> belongs to class
	
	public static void main(String args[]){
		int balance = 200;
		int amountToBeTxn=10; // local variable --> belongs to method
		
		System.out.println(" Balance is " + balance);
		System.out.println(" Transaction is " + amountToBeTxn);
	}
	
	void doSomething(){
		
		Payment pay = new Payment();
		System.out.println("Transaction amount " + pay.maxAmount );
	}
}