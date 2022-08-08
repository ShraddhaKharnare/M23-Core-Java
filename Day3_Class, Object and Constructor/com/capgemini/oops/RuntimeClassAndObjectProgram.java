package com.capgemini.oops;

import java.util.Scanner;

class Vehicle
{
  int a;                          //variable
  void display()                //user-defined method
  {
	  System.out.println("welcome to M23 Batch");
  }
}

public class RuntimeClassAndObjectProgram 
{
	public static void main(String[] args) 
	{
       Scanner s1=new Scanner (System.in);
       Vehicle obj=new Vehicle();   //object Creation
       System.out.println("Enter the value for a:");
       @SuppressWarnings("unused")
	int a =s1.nextInt();
             
		
       obj.a=s1.nextInt();
       
       obj.display();             //accessing the Vehicle class method
		
		//obj.a= 55;             //accessing the Vehicle class variable
		System.out.println(obj.a);
		s1.close();


	}

}
