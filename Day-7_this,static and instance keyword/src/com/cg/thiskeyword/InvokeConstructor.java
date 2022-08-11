package com.cg.thiskeyword;

class Z
{
	public int x;
	Z()
	{
		this(25);
		System.out.println("Defaut Constructor");
		
	}
	Z(int x)
	{
		System.out.println("Value is: "+x);
	}
}

public class InvokeConstructor 
{

	public static void main(String[] args) 
	{
	   @SuppressWarnings("unused")
	Z obj=new Z();
	   
	}

}
