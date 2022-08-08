package com.capgemini.oops;
class Animal
{
	int x;
	Animal()
	{
		x=15;
	}
	
	void display()
	{
		System.out.println("Lion"+x);
	}
}
public class NonParameterizeConstructor {

	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.display();
	}

}
