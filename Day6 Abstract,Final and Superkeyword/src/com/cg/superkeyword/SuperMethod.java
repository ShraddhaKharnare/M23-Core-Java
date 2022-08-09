package com.cg.superkeyword;

class A
{
	public int Pin;
	public void display(int pin)
	{
		System.out.println("Pin is:" +pin);
	}	
}

class B extends A
{
	public int Pin=45268;
	public void display(int pin)
	{
		System.out.println("Pin is:" +pin);
	}
	public void print()	
	{
		display(3124);
		super.display(3221);
	}	
}

public class SuperMethod {

	public static void main(String[] args)
	{
		B b=new B();
		b.print();

	}

}
