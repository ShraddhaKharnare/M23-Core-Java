package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping_CollectExample
{

	public static void main(String[] args)
	{
		List<Integer>obj1=Arrays.asList(5,11,12,5,22,44,88);
        obj1.stream().map(i->i*i).forEach((i)->System.out.print(i+" "));
	    System.out.println();
        //get output as square of integers
	
        //stream class-collections is just like a collections class
        List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
        System.out.print(obj2+" ");
	}

}
