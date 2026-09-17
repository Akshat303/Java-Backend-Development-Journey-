class AddTwoNo
 {
	public static void main(String args[])
	 {
	   int num1 = Integer.parseInt(args[0]);
	   int num2 = Integer.parseInt(args [1]);
	   
	   int result = AddTwoNo.sumTwoNo(num1, num2);
	   System.out.println ("Sum of " + num1 + " + " + num2 + " = " + result);
	}
	
	static int sumTwoNo(int num1 , int num2)
	 {
		return num1 + num2;
	 }
 }