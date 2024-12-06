package Inheritance;//Assignment 56: Write a program for constructor inheritance- Multi level using a parameterized super calling statement with explicit invocation
class FlipkartLogin
{
	FlipkartLogin(String name)
	{
		System.out.println("Constructor 1");
	}
}

class FlipkartLogout extends FlipkartLogin
{
	FlipkartLogout(int a)
	{
		super("sneha");
		System.out.println("Constructor 2");
	}
}
public class FlipkartSupport extends FlipkartLogout
{
	FlipkartSupport()
	{
		super(100);
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) 
	{
		new FlipkartSupport();

	}

}
