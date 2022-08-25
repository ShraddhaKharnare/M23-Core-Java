package com.cg.lambdaexprsn;

interface C
{
	
	/* 1. Lambda
	 2.
	 */
	void display();
	//void accept();
}

public class InterfaceImplementation 
{

	public static void main(String[] args) 
	{
		C obj=()->
		{
			
		};
		obj.display();

	}

}
