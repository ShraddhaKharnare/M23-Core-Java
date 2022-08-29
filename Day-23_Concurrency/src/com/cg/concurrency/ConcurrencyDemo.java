package com.cg.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo 
{
	public static void main(String[] args) throws ExecutionException
	{	
		//Lambda expression for runnable interface(Functional Interface)
		Runnable r=()->
		{
		try
		{
			TimeUnit.MILLISECONDS.sleep(1000);
			System.out.println("CurrentTime:"+LocalDateTime.now());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	};
	//execute service instance
     ExecutorService obj=Executors.newFixedThreadPool(10);
     obj.execute(r);
     Future<String> res=obj.submit(r,"Done");
     
     //if Done()->task completed it return to true else false
     while(res.isDone()==false)
     {
    	 try 
    	 {
    	 System.out.println("The method return value: "+res.get());
         break;
         }
    	 catch(InterruptedException | ExecutionException e)
    	 {
    		 System.out.println("Exception Handled");
    	 }
    	 
    	 try 
    	 {
    	     Thread.sleep(1000L);
         }
    	 catch(InterruptedException e)
    	 {
    		e.printStackTrace();
    	 }
      }
     obj.shutdown();
}
}
