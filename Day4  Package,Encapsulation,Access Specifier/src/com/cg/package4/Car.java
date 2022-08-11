package com.cg.package4;

public class Car 
{ 
	 void print() 
	{
		System.out.println("Brand New Car");
	}

class Mercedes extends Car
 {
	public void print1() 
	{
		System.out.println("Mercedes Benz");
	}
	
 	 }	

	public static void main(String[] args) 
	{
		Car c=new Car();
		
		c.print();
		
		
	}
}
