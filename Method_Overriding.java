package Inheritance;//Assignment 58: Write a program for method overriding using super keyword
class Method
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
	void logout()
	{
		System.out.println("Logout from mobile application");
	}
}
public class Method_Overriding extends Method
{
	void login()
	{
		super.login();
		System.out.println("Login with email id");
	}
	void logout()
	{
		System.out.println("Logout from mail application");
		super.logout();
	}

	public static void main(String[] args) 
	{
		Method_Overriding m1= new Method_Overriding();
		m1.login();
		m1.logout();
		
		

	}

}

