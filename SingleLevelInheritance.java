package Inheritance;

class parent1//Assignment 48: Write a program for single-level inheritance using a static method in the same class name in the single package explorer.
{
	static void add()
	{
		System.out.println("In a parent class");
	}
}

public class SingleLevelInheritance extends parent1
{

	static void subtract()
	{
		System.out.println("In a child class");
	}
	
	public static void main(String[] args) 
	{
		
		subtract();
		add();
		

	}

}

