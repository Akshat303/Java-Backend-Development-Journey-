package pdfKodewala.JavaMethod;

/*
public		Accessible from anywhere subject to module/package rules
private		Only within the declaring class
protected	Same package + subclass access rules
Default		Same package
 */

public class JavaMethod
{
	public static void main(String[] args)
	{
		// Creating an instance of the Welcome method class

		Welcome jm = new Welcome();

		// calling the method
		jm.sayHello();

	}

}

class Welcome
{
	// creating the method no return type b/c void is not a return type that print
	// the message
	public void sayHello()
	{
		System.out.println("JavaMethod.sayHello()... Welcome");
	}
}