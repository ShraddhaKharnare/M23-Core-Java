package com.cg.Inheritance;
class Bike
{
	protected int speed;
	void display() {
		System.out.println("I like to drive Bike");
	}
}


class Pulser extends Bike
{
	protected String colour;
	void print() 
	{
	
		System.out.println("Speed is:"+speed);
	}
}

class Pulser125 extends Pulser
{

	void accept() 
	{
		System.out.println("colour is:" +colour);
	}
}

public class MulTiLevelInheritance 
{
	public static void main(String[] args)
	{
		Pulser125 p=new Pulser125();
		p.speed=60;
		p.colour="black";
		p.accept();
		p.display();
		
		
	}

}
