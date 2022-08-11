package com.cg.polymorphism;
class Triber 
 {
	int speed;
	String engine;	
 
   Triber() 
     {
	System.out.println("Renualt_Kiger");	
      }
 
   //teo parameters
 Triber(int speed, String engine) 
    {
 	this.speed=speed;
 	this.engine=engine;	
 	System.out.println("Speed is:\"+speed+\"km/hr\"+\" and engine is: "+engine);
     }
 }
public class ConstructorOverloading
{

	public static void main(String[] args) 
	{
		Triber t=new Triber();
		Triber t1=new Triber(45,"Disel");
		
	}

}
