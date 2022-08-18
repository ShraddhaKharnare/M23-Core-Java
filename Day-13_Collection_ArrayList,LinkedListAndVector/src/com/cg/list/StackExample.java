package com.cg.list;

import java.util.Stack;

public class StackExample 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Stack obj=new Stack();
		obj.add(1,"Shraddha");
		obj.add(7,"Z");
		obj.add(3,5);
		System.out.println(obj);
		obj.push(25);
		System.out.println(obj);
		obj.pop();
		System.out.println(obj);
		
		

	}

}
