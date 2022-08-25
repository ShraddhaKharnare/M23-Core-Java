package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo 
{

	public static void main(String[] args) 
	{
		//stream can be created using static data
	 Stream<String>obj=Stream.of("Priyanka","Sumit", "Devyani", "Ashutosh");
	 //Terminal operation-forEach
	 obj.forEach((i)->System.out.println(i+ " "));
	 System.out.println();
	 
	//stream can be acquire from array or collection
	 List<String>obj1=Arrays.asList(new String[] {"78","56","23","45"});
	 obj=obj1.stream();
	 obj.forEach(System.out::println);
	
	}
}
