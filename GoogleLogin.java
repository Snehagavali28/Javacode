package Inheritance;//Assignment 55: Write a program for constructor inheritance- single level using a parameterized super calling statement with explicit invocation
class Googlelogout 
{
	Googlelogout(int a)
	{
		
		System.out.println("Constructor 1");
	}
}
public class GoogleLogin extends Googlelogout
{
	GoogleLogin()
	{
		super(100);
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) 
	{
		GoogleLogin g1= new GoogleLogin();

	}

}
