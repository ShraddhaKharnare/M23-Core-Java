package com.cg.annotations;

class A
{
	//it allows any elements no longer to be used
	@Deprecated
  public void print()
   {
	  System.out.println("Welcome to the Deprecated Annotaion"); 
   }
}
public class DeprecatedAnnotation 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.print();	
	}

}
