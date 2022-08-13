package com.cg.string;

import java.util.StringTokenizer;

public class StringtokeinizerusingWhile {

	public static void main(String[] args)
	{
	StringTokenizer st=new StringTokenizer("Lets try This ...");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
	


		

	}

}
