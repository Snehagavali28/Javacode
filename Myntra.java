package Inheritance;/*Assignment 50: Write a program for single-level inheritance using a static and Non-static method in 
the different class name in the single package explorer.*/

public class Myntra extends GoogleAuth
{
	static void login()
	{
		System.out.println("In Myntra static login subclass");
	}
	void authenticate()
	{
		System.out.println("In Myntra non static authenticate subclass");
	}
	public static void main(String[] args) 
	{
		Myntra m1= new Myntra();
		login();
		m1.authenticate();
		m1.verification();
		payment();
	}
}
