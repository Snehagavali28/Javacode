package Inheritance;//Assignment 57: Write a Program on This Calling Statement

public class ThisCallingStatement 
{
	ThisCallingStatement()
	{
		this(true);
		System.out.println("First Constructor");
	}
	
	ThisCallingStatement(String a)
	{
		System.out.println("Second constructor");
	}
	
	ThisCallingStatement(boolean b)
	{
		this("abc");
		System.out.println("Third constructor");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatement();
	

	}

}
