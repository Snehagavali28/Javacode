package Inheritance;//Assignment 51: Write a Program for MultiLevel Inheritance
class Grandparent
{
	static void login_auth()
	{
		System.out.println("In a Grand parent class");
	}
}
class parent extends Grandparent
{
	static void login()
	{
		System.out.println("In a parent class");
	}
}

public class MultilevelInheritance extends parent
{
	static void logout()
	{
		System.out.println("In a child class");
	}
	public static void main(String[] args) 
	{
		login_auth();
		login();
		logout();

	}

}
