package com.cg.thiskeyword;
class A
{
	
		public int num;
		A()
		{
		System.out.println("Welcome to java program");
	     }
	
	A(int num)
	{
		num=num;
		
	}
}
public class InstanceConstructor 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		A a=new A();
		A b=new A(5);
		System.out.println(b.num);
		


	}

}
