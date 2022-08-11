package com.cg.statickeyword;

public class StaticBlock
{
	static int num;
	static String str;
	static
	{
		num=15;
		str="Shraddha";
		
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
		System.out.println(num);
		System.out.println(str);
		
		

	}

}
