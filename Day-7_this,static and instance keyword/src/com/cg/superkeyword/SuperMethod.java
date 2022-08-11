package com.cg.superkeyword;

class Animal
{
	public int a=10,b=20;
	void dispay()
	{
		System.out.println("The Addition of a and b is: "+(a+b));
	}
}
class Tiger extends Animal
{
  public void display()
   {
	System.out.println("Tiger");
    }
  
  void print()
	{
	  display();
	  super.dispay();
	}
}
public class SuperMethod {

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.dispay();
		t.print();

	}

}
