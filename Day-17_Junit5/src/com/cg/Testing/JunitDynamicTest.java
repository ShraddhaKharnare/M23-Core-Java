package com.cg.Testing;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class JunitDynamicTest
{
	@TestFactory
	Collection<DynamicTest>print()
	{
		return Arrays.asList(dynamicTest("simple dynamic Test",()->assertTrue(true)),
		    dynamicTest("My Excutable class",new MyExcutable()));
	};
	
}
class MyExcutable implements Executable
{
	public void execute()
	{
		System.out.println("Welcome to M23 Batch");
	}
}