class FundTransfer{
	public static void main(String args[])
	{
	  System.out.println ("Starting main()");
	  
	  // Calling the method and passing the value(input)
		boolean result = FundTransfer.doTransaction(10, "12355945", "64622612340");
		System.out.println("Is txn Successful ? " + result);
		System.out.println("end main()");
	}
	
	static boolean doTransaction(int amountToBeTnx, String senderAccNo, String reciverAccNo){
		System.out.println("Entered doTransaction()");
		System.out.println("input Received " + amountToBeTnx + " " + senderAccNo + " " + reciverAccNo );
		//some biz which will perform the transaction.
		
		System.out.println("Exit doTransaction");
		return true;
	}

}