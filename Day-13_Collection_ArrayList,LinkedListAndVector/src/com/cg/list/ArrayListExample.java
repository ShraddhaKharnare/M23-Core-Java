package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List obj=new ArrayList<>();
		obj.add(11);
		obj.add("Shraddha");
		obj.add(71.77);
         System.out.println(obj);
         System.out.println(obj.size());
         obj.remove(2);
         System.out.println(obj);
         System.out.println(obj.indexOf(11));
         System.out.println(obj);
       
	

	}

}
