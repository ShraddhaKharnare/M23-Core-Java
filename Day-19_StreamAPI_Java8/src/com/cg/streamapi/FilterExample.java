package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterExample
{
	public static void main(String[] args)
	{
		List<String>obj=Arrays.asList("Hema","Rekha","Jaya","Aur","Sushma");
        //to return the string whose length is greater than 3.
		obj.stream().filter(i->i.length()>3).forEach((i)->System.out.print(i+" "));
	
        //Aur will not pass because of having length<3
	}

}
