package com.cg.queue;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample
{
	public static void main(String[] args) 
	{
		NavigableMap<Integer,String> httpcode=new TreeMap<Integer,String>();

				httpcode.put(200,"ok");
				httpcode.put(100,"continue");
				httpcode.put(102,"processing");
				httpcode.put(201,"created");
				httpcode.put(103,"early hints");

				System.out.println(httpcode);
				System.out.println(httpcode.firstEntry());
       			System.out.println(httpcode.lastEntry());
	}
}
