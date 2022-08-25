package com.cg.Testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger
{
	//it is used to signal that the annotation method should be executed 
	//after all test in the current test class
	@Test
	 default void testMethod()
	{ 
		System.out.println("Test Method");
	}
	
	//it is used to signal that the annotation method should be executed 
	//before all test in the current test class
	@BeforeAll
	 default void beforeAllTests()
	{ 
		System.out.println("Before all test");
		
	}
	
}
