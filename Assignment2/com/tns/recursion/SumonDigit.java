package com.tns.recursion;

import java.util.Scanner;

public class SumonDigit 
{
	static int sum (int n)
	{
		if (n==0)
		return 0;
		else 
			return (n%10 + sum (n/10));
	}

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
	 	int n=s.nextInt();
	 	System.out.println("Sum of Digit is:");
	 	System.out.println(sum(n));
	 	
	 	s.close();
}
	
	
	
}

