package com.cg.Inheritance;
class Parent
{
	protected int rollno;
	 void print()
	 {
		System.out.println("Hello there");  
	}
	
}

class Child extends Parent
{
	 void accept()
		{
			System.out.println("rollno is: "+rollno);  
		}	
}


public class SingleInheritance {

	public static void main(String[] args)
	{
      Child c=new Child();
      c.print();
      c.rollno=212;
      c.accept();
      
      

	}

}
