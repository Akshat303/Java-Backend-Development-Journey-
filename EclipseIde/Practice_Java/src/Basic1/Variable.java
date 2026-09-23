package Basic1;

public class Variable {

	public static void main(String[] args) {
		int var1 = 5;
		System.out.println(var1);
		
		int var;
		var = 20;
		System.out.println(var);
		var1 = 25;
		System.out.println(var1);
		
		var1 = var1 +2;
		System.out.println(var1);
		
		//TypeCasting
		
		char ch = 'A';
		int x = ch; //implicit typecasting
		System.out.println(ch);
		System.out.println(x);
		
		char cha = 'a';
		int charType = (int)cha; //explicit typecasting
		System.out.println(charType);
		
		
		char cha1 = '3';
		System.out.println((int)cha1);
		
		char ch2 = 'b';
		System.out.println(ch+0);
		
		int in = 65;
		char ca = (char)in;
		System.out.println(ca);

	}

}
