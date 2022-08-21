package com.cg.multithreading;

 class Thread1example extends Thread
{
    public void display()
    {
    	System.out.println("Thread Interrupted");
    }
	public static void main(String[] args) 
	{
		Thread1example t=new Thread1example();
		t.start();
		System.out.println("is thread Interrupted"+t.isInterrupted());
		t.interrupt();
		System.out.println("is thread Interrupted"+t.isInterrupted());
	}

}
