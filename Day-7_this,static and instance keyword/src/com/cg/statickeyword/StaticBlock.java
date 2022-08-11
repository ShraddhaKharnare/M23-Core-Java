package com.cg.statickeyword;

public class StaticBlock
{
	static int a;
	static String name;
	static
	{
		a=24;
		name="Shraddha";
		
	}

	/*//Constructor
	 StaticBlock()
	{
		num=15;
		str="Shiwani"
	}*/


	public static void main(String[] args)
	{
		//StaticBlock sb=new StaticBlock();
		//System.out.println(sb.num);
		//System.out.println(sb.str);
		System.out.println(a);
		System.out.println(name);
		
		

	}

}
