package com.cg.polymorphism;

//program on method overriding
//one classs not enough create 2-3 class which contain inheritance concept

class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a+b);
	}
}

class Mult extends Multiplication
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverRidding 
{

	public static void main(String[] args) 
	{
		Mult m=new Mult();
		m.accept(12, 5);
		Multiplication m1=new Multiplication();
		m1.accept(4, 6);
		

	}

}
