package com.cg.multithreading;
 class Test1

{
	public static synchronized void display() 
	{
		System.out.println("Current Thread"  +Thread .currentThread ());
	    for(int i=0; i<5; i++)
	    {
	    	System.out.println(Thread.currentThread().getName()"i");
	    		try 
	    		{
				  Thread.sleep(50);
				} 
	    		catch (InterruptedException e) 
	    		{
					e.printStackTrace();
				}
	    	}
	    	
	    }
}

class Valueof implements Runnable
{
Thread t;
Test1 val;
Valueof(Test1 val)
{
	this.val=val;
	t=new Thread(this);
	t.start();
}


public void run() 
   {
     val.display();
   }

public static class StaticTest
{
@SuppressWarnings("unused")
public static void main(String args[])
{
	Test1 obj1=new Test1();       //only one object
 	Test1 obj2=new Test1();
    Valueof v1=new Valueof(obj1);
    Valueof v2=new Valueof(obj2);
}


}
}

