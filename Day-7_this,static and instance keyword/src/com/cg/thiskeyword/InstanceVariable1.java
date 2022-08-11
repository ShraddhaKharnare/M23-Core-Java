package com.cg.thiskeyword;
class X
{
	int m1,m2;
	public void print()
	{
		this.m1=m2;
		this.m2=m1;
	}

   public void display()
  {
 	System.out.println("Addition of m1 and m2is;" +(m1+m2));
   }
public static class InstanceVariable1 {

	public static void main(String[] args) 
	{
		X obj=new X();
		obj.print();
		obj.display();
		
	}



	}

}
