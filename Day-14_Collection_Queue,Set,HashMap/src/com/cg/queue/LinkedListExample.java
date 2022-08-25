package com.cg.queue;

import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args)
	{
		
		LinkedList<Object> obj=new LinkedList<>();
		obj.add(11);
		obj.add("Shraddha");
		obj.add(71.77);
		obj.add(11);
		obj.add(71.77);
         System.out.println(obj);
         System.out.println(obj.size());
         obj.remove(2);
         System.out.println(obj);
         System.out.println(obj.indexOf(11));
         System.out.println(obj);
       
	}

}
