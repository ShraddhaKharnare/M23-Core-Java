package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class MappingExample 
{

	public static void main(String[] args) 
	{
		List<String>obj=Arrays.asList("Hema","Rekha","Jaya","Aur","Sushma");
        //to return the string whose length is greater than 3.
		obj.stream().map(i->i.length()>3).forEach((i)->System.out.print(i+" "));
		
		/*obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" ")); 
	   if we do not gives length we get output as 4 5 4 3 6 
	   otherwise we get output as true true true false true*/
	}

}
