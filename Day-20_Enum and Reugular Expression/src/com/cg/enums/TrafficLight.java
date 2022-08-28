package com.cg.enums;

public enum TrafficLight
{
 RED(30),YELLOW(10),GREEN(30);
	private final int seconds;
	
	//constructor
	
	private TrafficLight(int seconds)
	{
		this.seconds =seconds ;
	}
	
	//we get getters method because we use constructor to set the value
    public int getSeconds()
    {
    	return seconds;
    }

	public static void main(String[] args) 
    {
	 for(TrafficLight i:TrafficLight.values())
	 {
		 //value method is use to access all the values inside the constants
		 System.out.printf("%s: %d seconds\n",i,i.getSeconds());
	 }
}
}