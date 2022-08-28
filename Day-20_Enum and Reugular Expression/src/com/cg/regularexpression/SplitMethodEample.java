package com.cg.regularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethodEample 
{

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) 
	{
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
	  //String delimeter="\\d";
      String delimeter="\n";
	  
	  //String will split by digit
	  Pattern p=Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
	  String res[]=p.split(str);
	  for(String i:res)
	  {
		  System.out.println(i+" ");
	  }
	}

}
