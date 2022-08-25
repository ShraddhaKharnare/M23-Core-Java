package com.cg.lambdaexprsn;

@FunctionalInterface
interface E
{
	int add(int a,int b); //abstract method
	
}
public class FunctionalInterfaceExample 
{

	public static void main(String[] args) 
	{
		/* lambda expression with return statement
		E obj=(int a, int b)->
		{
			return a+b;	
		};
		System.out.println(obj.add(12,15));*/
		//lambda expression without return statement
		E obj=(int a, int b)->(a+b);
		System.out.println("Adddion of a and b is:"+obj.add(12,15));
	}

}
