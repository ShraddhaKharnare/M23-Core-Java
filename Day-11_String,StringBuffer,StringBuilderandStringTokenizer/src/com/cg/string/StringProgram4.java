package com.cg.string;

import java.util.Scanner;

public class StringProgram4 
{
	public static void main(String[] args)
	{
		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String st1= s.nextLine();
	     if(st1.equals(str))
		 {
			 System.out.println("Matching");
		 }
		 else
		 {
			 System.out.println("Not Matching");
		 }
		 s.close();
	}

}
