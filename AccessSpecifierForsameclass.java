package Inheritance;//Assignment 60 Write a program to check which method access specifiers are accessible inside same class

public class AccessSpecifierForsameclass 
{

	private void add()
	{
		System.out.println("in private method");
	}
	public void sub()
	{
		System.out.println("in public method");
	}
	protected void mul()
	{
		System.out.println("in protected method");
	}
	void div()
	{
		System.out.println("in Default method");
	}
	public static void main(String[] args) 
	{
		AccessSpecifierForsameclass a1=new AccessSpecifierForsameclass();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		

	}

}
