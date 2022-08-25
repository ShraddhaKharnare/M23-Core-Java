package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingExample 
{
	public static void main(String[] args)
	{
		//Reducing operation 
		List<Integer>obj=Arrays.asList(5,11,12,5,22,44,88);
        Optional<Integer>result=obj.stream().reduce((i,j)->i>j?i:j);
		
        if(result.isPresent())
        {
        	System.out.println("Result is:"+result.get());
          //it will display greater value.
        }
		
	}

}
