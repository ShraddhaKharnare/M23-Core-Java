package com.cg.generics;

public class  GenericsClassExample<T>

{
	//how to create generic class demo
	T num;
	public void show()
	{
		System.out.println(num.getClass().getName());
	}
 public static void main(String [] args) 
 {
	 //instead of collection I have used generic class name and generic concept
	 GenericsClassExample<Double>obj=new GenericsClassExample<>();
	 obj.num=13.8;
	 obj.show();
     
 }
	
}
