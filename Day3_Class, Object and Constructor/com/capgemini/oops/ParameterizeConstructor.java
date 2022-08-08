package com.capgemini.oops;
class Pulser
{
	 int speed;
	 String colour;
	Pulser(int speed,String colour )
	{
		this.speed=speed;
		this.colour=colour;
	}
	
	void accept()
	{
		System.out.println("Speed is:"+speed+"km/hr"+" and colour is : "+colour);
	}
}

public class ParameterizeConstructor {

	public static void main(String[] args)
	{
		Pulser p=new Pulser(45,"Red");
		p.accept();
	}
	
}
