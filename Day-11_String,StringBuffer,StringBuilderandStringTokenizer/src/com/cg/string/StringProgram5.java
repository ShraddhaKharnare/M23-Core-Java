package com.cg.string;

import java.util.Scanner;

public class StringProgram5 
{

	public static void main(String[] args)
	{
		System.out.println("Type a name");
		Scanner s=new Scanner(System.in);		
		String str1= s.nextLine();
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
		
		s.close();
	}

}
