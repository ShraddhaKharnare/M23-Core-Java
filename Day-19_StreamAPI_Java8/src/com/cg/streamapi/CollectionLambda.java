package com.cg.streamapi;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda 
{
	public static void main(String[] args)
	{
		Set<Integer> obj=new HashSet<>();
		obj.add(11);
		obj.add(33);
		obj.add(22);
		System.out.println(obj);
		
		//if we want to exact set value go ahead with iterator
		//while-loop and for-loop but using stream APL we can do it in one line;
		//extracting the value from set
        obj.forEach(System.out::println);
		
		
	}

}
