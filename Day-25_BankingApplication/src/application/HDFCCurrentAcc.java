package application;

import framework.CurrentAcc;

public class HDFCCurrentAcc extends CurrentAcc
{

	public HDFCCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public String toString() 
	{
		return String.format("MMCurrentAcc [toString()=%s]",super.toString());
	}
}

