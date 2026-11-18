package com.kodewala.overloading1;

public class Login {

	public String doLogin(String mobileNo, int otp) // version1
	{
		System.out.println("Login.doLogin()");
		return "Any";
	}

	private void doLogin(String email, String pass) // version2
	{
		System.out.println("Login.doLogin(pass)");
	}

	void doLogin(String gmail) // version3
	{
		System.out.println("Login.doLogin(email)");
	}

}
