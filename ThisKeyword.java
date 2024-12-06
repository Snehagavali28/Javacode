package Inheritance;/*Assignment 59 :Write a program where the non static global variable datatypes used are same 
as local variable. Use non static method to use the local variable in method. 
Use this key word to update the global variable value same as local variable.*/

public class ThisKeyword
{
	int age;
	String name;
	double salary;
	
	void employeedetails(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) 
	{
		ThisKeyword t1= new ThisKeyword();
		t1.employeedetails(18, "Yuvraj", 85000);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		
	}

}
