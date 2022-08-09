package com.cg.final1;
class Car
{
	String name;
	final void print(String name)
	{
		System.out.println("My name is :"+name);
	}
}
class Audi extends Car
{
	
}
public class FinalInheritedMEthod {

	public static void main(String[] args)
	{
       Audi a=new Audi();
       a.print("Audi");
      
      

	}

}
