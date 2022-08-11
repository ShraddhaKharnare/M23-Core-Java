package com.cg.statickeyword;

public class Staticbox
{
	double width;
	double height;
	static int count;
	//parameterized constructor
	public Staticbox (double width, double height)
	{
		this.width=width;
		this.height=height;
	}
 
	public Staticbox ()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("Cnt is:"+cnt);
		count=16;
		count++;		
		System.out.println("Count is:"+count);
	}

	public static void main(String[] args) 
	{
		Staticbox s=new Staticbox();
		//s.height=6;
		//s.width=23;
		System.out.println(s.width);
		
	}

}
