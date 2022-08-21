package com.cg.multithreading;

class  Main extends Thread

{

  public void run()

    {
     System.out.println("Thread Passed");
     }

}
  public class MainThread
  
  {
   public static void main(String args[])
   {
       Test create=new Test();
       create.start();
	   
     }

}
