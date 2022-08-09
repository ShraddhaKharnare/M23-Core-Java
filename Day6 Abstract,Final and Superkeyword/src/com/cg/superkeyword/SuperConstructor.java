package com.cg.superkeyword;
class Android
{	
	Android()
	{
		System.out.println("Oneplus is android mobile");
	}
	
class Lava extends Android
	{
		Lava()
		{
			super();
			System.out.println("Lava class constructor");
		}
	}
public class SuperConstructor 
{

	public void main(String[] args)
	{
		Lava l=new Lava();
		
		
	}
}		
}
	


