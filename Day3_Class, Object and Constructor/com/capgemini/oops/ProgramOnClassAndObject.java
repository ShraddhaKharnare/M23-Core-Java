package com.capgemini.oops;
 //demo on how to use class and object

class Car
{
  int a;                          //variable
  void display()                //user-defined method
  {
	  System.out.println("welcome to M23 Batch");
  }
}
public class ProgramOnClassAndObject 
{

	public static void main(String[] args) 
	{
		Car obj=new Car();        //object Creation
		obj.display();
		obj.a= 55;             //accessing the car class variable
		System.out.println(obj.a);
		
	}

}
