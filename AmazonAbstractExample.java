package Inheritance;/*Assignment 64 
Write a program which contains 1 abstract class, inside that abstract class mention 2 abstract method, 1 concrete non static method, 1 concrete static method. 
override the non static methods(abstract menthods+non static concrete method) and call all the methods in main method to execute.*/
abstract class Amazonweb
{
	abstract void login();
	abstract void regestration();
	static void add()
	{
		System.out.println("Static method in abstract class" );
	}
	void subtraction()
	{
		System.out.println("Non-Static method in abstract class" );
	}
	
}
public class AmazonAbstractExample extends Amazonweb
{

	void login() 
	{
		System.out.println("API 1");
		
	}
	void regestration() 
	{
		System.out.println("API 2");
		
	}
	public static void main(String[] args) 
	{
		AmazonAbstractExample a1= new AmazonAbstractExample();
		a1.login();
		a1.regestration();
		a1.subtraction();
		add();
		

	}

	
	

}
