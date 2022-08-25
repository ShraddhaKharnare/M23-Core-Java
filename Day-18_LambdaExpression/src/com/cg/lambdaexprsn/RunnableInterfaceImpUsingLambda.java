package com.cg.lambdaexprsn;

public interface RunnableInterfaceImpUsingLambda 
{
	public static void main(String[]args)
	{
	/*
	//runnable interface
   Runnable r=new Runnable()
   {
	public void run()
	   {
		System.out.println("Runnable interface implementation");
	   }
    };*/
	
	Runnable r=()->
	{
		System.out.println("Runnable interface implementation");
	};
    Thread t=new Thread(r);
    t.start(); //when we call start it will comes into run method as discussed in lifecycle of thread
}
}
