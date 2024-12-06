package Inheritance;//Assignment 53: Write a program for constructor inheritance using the super calling statement with Implicit Invocation
class Googleprog
{
	Googleprog()
	{
		System.out.println("Google constructor");
	}
}

public class Amazon extends Googleprog 
{
	Amazon()
	{
		// implicit invocation of super calling statement
		System.out.println("Amazon constructor");
	}
	public static void main(String[] args) 
	{
		Amazon a1= new Amazon();

	}

}
