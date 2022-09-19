package application;

import framework.SavingAcc;

public class HDFCSavingAcc extends SavingAcc
{

	public HDFCSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		super(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public String toString()
	{
		return String.format("MMSavingAcc [toString()=%s]",super.toString());
	}
}
