package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringDemo 
{
	public static void main(String[] args) 
	{
		List<Integer>obj=Arrays.asList(5,11,12,5,22,44,88);
        //filter{predicate}method
		System.out.println("The Filter is:");
		obj.stream().filter(i->i>10).forEach((i)->System.out.print(i+" "));
        System.out.println();
        
        System.out.println("The Distincts Elements are:");
        obj.stream().distinct().forEach((i)->System.out.print(i+" "));
        
        System.out.println();
        System.out.println("The Limit is:");
        obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
	
        System.out.println();
        System.out.println("The Discarded is:");
        obj.stream().skip(3).forEach((i)->System.out.print(i+" "));
        
	}
}
