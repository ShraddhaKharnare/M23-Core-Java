package com.cg.lambdaexprsn;

interface A
{
	void print(); //abstract method
}

//length of code is increases using Implementation class B
/*
class B implements A
{

    override 
	public void print()
	{
		System.out.println("FunctionalInterfaceImplmentatn without/r" + "Lambda Expression");
	}
	
}*/
public class FunctionalInterfaceImplmentatn 
{
  public static void main(String[]args)
  
  /*
	  B b=new B();
	  b.print();
	  1.lambda exp implementation the functional Interface
	  2.Length of the code is decrease using lambda expression
  */
  {
    A obj=()->
       {
	  System.out.println("Funtional Interface Implementation" );   //+ "Lambda Expression")
       };
       obj.print();
  }
}
