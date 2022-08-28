package com.cg.annotations;

class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is:"+s+ "km/hr");
	}
}

class BMW extends Car
{
	@Override
	public void speed(int a)
	{
		System.out.println("Speed is:"+a+ "km/hr");
	}
}

public class OverrideAnnotation
{

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.speed(60);
		b.speed(40);
		

	}

}
