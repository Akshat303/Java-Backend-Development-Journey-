package pdfKodewala.JavaVariables;

public class SVRealExample
{
	public static void main(String[] args)
	{
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();

		System.out.println(User.totalUsers);
	}
}

class User
{
	static int totalUsers = 0;

	// Constructor
	User()
		{
			totalUsers++;
		}
}
