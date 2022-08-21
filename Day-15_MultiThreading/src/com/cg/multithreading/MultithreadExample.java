package com.cg.multithreading;

class Test extends Thread
{
    public synchronized void display()
    {
     System.out.println("Current thread" +Thread.currentThread());
     }
}

public class MultithreadExample extends Thread
{
	 public static void main(String args[])
	   {

		   Test create=new Test();
		   create.start();
		   create.run();
		   create.run();
	     }
}
	