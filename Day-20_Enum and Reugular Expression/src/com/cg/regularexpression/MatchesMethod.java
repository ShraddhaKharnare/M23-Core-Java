package com.cg.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;


//Demo on matches() method of a pattern class
public class MatchesMethod 
{	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String pattern="JAVA#$PROGRAM";
		String input=sc.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
	}

}
