package com.cg.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompileMethodAndMacherClassEx
{	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("and");
		//Matcher m=p.matcher("Java is object oriented language and earn money and I like to learn java");
		
		System.out.println("Enter the String :");
		Matcher m=p.matcher(s.nextLine());  // by using user input		
		//it will check 'and' locations until last and it will print
		while(m.find())
		{
			System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
		}
		s.close();	
	}
}
