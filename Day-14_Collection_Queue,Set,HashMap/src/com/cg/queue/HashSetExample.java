package com.cg.queue;

import java.util.HashSet;
public class HashSetExample 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add("HashSet");
		hs.add(11);           //it will not display duplicate value 
		hs.add(365.0);
		System.out.println(hs);
		
		
	}

}
