package Inheritance;//Assignment 54: Write a program for constructor - single level inheritance using a non-parameterized super calling statement with explicit invocation
class AmazonIN
{
	AmazonIN()
	{
		System.out.println("Constructor 1");
	}
}
public class AmazonLogin extends AmazonIN
{
	AmazonLogin()
	{
		super();
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) 
	{
		new AmazonLogin();

	}

}
