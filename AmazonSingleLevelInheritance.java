package Inheritance;

class Google//Assignment 49: Write a program for single-level inheritance using a Non-static method in the same class name in the single package explorer.
{
	void auth()
	{
		System.out.println("Parent class non static method");
	}
	static void twowayauth()
	{
		System.out.println("Parent class static method");
	}
}

public class AmazonSingleLevelInheritance extends Google
{
	static void login()
	{
		System.out.println("Child class method");
	}
	public static void main(String[] args) 
	{
		AmazonSingleLevelInheritance a1= new AmazonSingleLevelInheritance();
		login();
		twowayauth();
		a1.auth();
		
	}

}
