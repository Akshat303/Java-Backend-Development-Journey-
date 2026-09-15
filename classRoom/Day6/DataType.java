class DataType{
 public static void main (String agrs[]){
 
  byte age = -5;  // Range -128 to 124
  // Out of range => error: incompatible types: possible lossy conversion from int to byte
  //int amount = 56544513202645232556; //error: integer number too large
  System.out.println(age);
  // System.out.println(amount) ;s
 }
}

class NextDataType{
	static short amountNext; // default = 0
	static boolean status; // default = false
	static char name = 'j'; // default Char
	public static void main (String [] args){
		System.out.println(status);
		byte num = 26;
		byte num2 = 2;
		int num3 = 6;
		// float long floatNum = 3665.1548 ;
		System.out.println(num);
		
		System.out.println(num + num2);
		
		System.out.println("byte+int = " + num + num3);
		System.out.println("Char = " + name);
		System.out.println("int+char = " + num3 + name); //int+char = 6j
		// System.out.println(floatNum);
	}
}