package com.cg.queue;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample 
{
	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		// SortedSet obj=new SortedSet(); //SortedSet declaration
		SortedSet obj=new TreeSet();
		obj.add(45);
		obj.add(11);
		obj.add(34);

		System.out.println(obj);

		}	
	}


