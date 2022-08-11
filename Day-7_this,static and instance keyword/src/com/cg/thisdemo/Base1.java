package com.cg.thisdemo;

public class Base1 
{
    Base1()          //default cons
    {
    	this(65);
    	System.out.println("Default Constructor for Base1");
    }
    Base1(int i)       //parameterized cons
    {
    	System.out.println("Parameterized Constructor for Base1: "+i);
    }
}
