package com.cg.package2;
class A
{
	private int pin =1221;
	  void display() 
	 {
		  System.out.println("Pin no. is:"+pin);
	  }
}

public class Demo 
{
     public static void main (String[]args)
     {
       A a=new A();
       a.display();
        
     }
}
