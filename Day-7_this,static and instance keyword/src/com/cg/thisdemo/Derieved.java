package com.cg.thisdemo;

public class Derieved  extends Base1 
{
	Derieved()
	{
		 System.out.println("Default Constructor for Derieved");  
	   }
	 Derieved(int i)
	   {
		 this();
		 System.out.println("Parameterized Constructor for Derieved: "+i);  
	   }
}
