package com.abstraction;

public class User extends Demo {

	@Override
	void login(String username, String password) {
		
		if(username.length()<3)
		{
			System.err.println("Username should be atleast 3 or more characters");
		}
		
		if(password.length()<3)
		{
			System.err.println("Password should be atleast 3 or more characters");
		}
		if(username.length()>3 && username.equals("aadi") && password.equals("1212") && password.length()>3)
		{
			System.out.println("Login Successfull");
		}
	}
	
	public static void main(String[] args) {
		
		User user=new User();
		
		user.login("aa", "12");
	}
}
