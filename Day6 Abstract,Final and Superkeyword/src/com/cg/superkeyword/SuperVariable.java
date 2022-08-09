package com.cg.superkeyword;
class colour
{
	protected String name="Pink";
	protected void display() 
	{
			System.out.println("Colour is:" +name);
	}
}

class Blue extends colour
{
	public String name="Blue";
	public void display()
	{
		System.out.println("name");
		System.out.println(super.name);
	}	
}

public class SuperVariable 
{

	public static void main(String[] args)
	{
		Blue b=new Blue();
	    b.display();
	}
}