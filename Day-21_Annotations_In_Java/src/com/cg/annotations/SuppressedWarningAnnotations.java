package com.cg.annotations;

class Animal
{
	Animal()
	{
		System.out.println("Lion"); //Non-parameterized constructor
	}
	/*public void sound()
	{
		System.out.println("Roars");
	}*/
}

public class SuppressedWarningAnnotations
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Animal a=new Animal();
		

	}

}
