package com.cg.Testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTestDemo 
{
	@RepeatedTest(5)  //it will repeate the test for given set of time
	 void print()
	{
		System.out.println("Hey there, this is repeated test");
	}
}
