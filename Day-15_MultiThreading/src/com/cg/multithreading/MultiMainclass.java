package com.cg.multithreading;

public class MultiMainclass 
{
	public void main(String[] args) 
	{
		Thread t = Thread.currentThread( );
		System.out.println("Current Thread :" + t);
		t.setName("XYZ");
		System.out.println("Current thread :" +t);
		try
		{
		Thread.sleep(1);
		}

		catch (InterruptedException e)
		{
		System.out.println("Main Thread Interrupted");
		}
      }
}

