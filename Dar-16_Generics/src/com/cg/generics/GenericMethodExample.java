package com.cg.generics;

public class GenericMethodExample 
{
	//when we use generic method we can pass any types of argument in the method
	public static<E>void printArray (E[] elem)
	{
	for(E itr:elem)
	{
		System.out.println(itr.getClass().getName()); //to check the className
		System.out.println(itr);
	}
   }
	public static void main(String[] args)
	{
		Integer[] arr= {10,20,30};
		Character [] arr2= {'z','x','s'};
		System.out.println("Printing Array for Integer");
		printArray(arr);
		System.out.println("Printing Array for Character");
		printArray(arr2);
    }
}
