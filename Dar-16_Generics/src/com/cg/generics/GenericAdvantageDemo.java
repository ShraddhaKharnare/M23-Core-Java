package com.cg.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GenericAdvantageDemo 
{
	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(12);
		//Type1 safety
		//obj.add("Shraddha");   we cannot add string
		
		System.out.println(obj);
		//2.type-casting is not required
		List<Integer>obj2=new ArrayList<>();
		obj2.add(15);
		//3.compile time checking
		//obj2.add("15");
		
		@SuppressWarnings("unused")
		Integer i=obj2.get(0);
		System.out.println(obj2);
		
	}

}
