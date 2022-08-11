package com.cg.thiskeyword; 

class B
{    void accept1(B b)
    {
    	System.out.println("Function is invoke");
    }
    void accept2()
    {
    	accept1(this);
  
    }
}
class Argument_MethodCalling
{
     public static void main( String [] args)
     {
    	B b=new B();
    	b.accept2();
     }
		
		
}

