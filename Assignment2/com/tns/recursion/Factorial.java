package com.tns.recursion;

import java.util.Scanner;

public class Factorial 
	{
	static int factorial(int n)
	{
	int fact=1;
	for(int i=1; i>1; i++)
	{
	fact=fact*i;
	}
	return fact;
}

  public static void main(String[] args)
  {
	  @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  System.out.println(factorial(n));
  }
}
