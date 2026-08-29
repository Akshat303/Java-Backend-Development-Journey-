class NameCheck{
	public static void anyName (String ar[])// error method name is wrong, use main
	{
	System.out.println("Hello fine");
	}
}

class Name2{
	public static void main(String anyName[])
	{
		System.out.println("Without public static is give error");
	}
}

class Name3{
	public static void main(String []xyz)
	{
		System.out.println("[]anyName");
	}
}