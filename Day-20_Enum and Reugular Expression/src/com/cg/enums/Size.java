package com.cg.enums;

//
  public enum Size implements PizzaSize
{	
	Small,Medium,Large,ExtraLarge;
	  
	@Override
	public void size()
	{
		System.out.println("Size is:"+this);
	}
}
