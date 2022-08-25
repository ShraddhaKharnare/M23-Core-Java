package com.cg.lambdaexprsn;

public interface MaxFinderTest
{
   public static void main(String []args)
   {
	   MaximumFinder obj=(a,b)->a>b?a:b;
	   System.out.println("The greatest value is:"+obj.maximum(23,30));
   }
}
