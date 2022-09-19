package application;

import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class HDFCBankFactory extends BankFactory
{

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float isSalaried)
	{
		HDFCCurrentAcc h=new HDFCCurrentAcc(accNo, accNm, accBal, isSalaried);
		return h;
	}

	@Override
	public SavingAcc  getNewSavingAcc(int accNo, String accNm, float accBal, boolean creditLimit) 
	{
		HDFCSavingAcc h=new HDFCSavingAcc(accNo, accNm, accBal, creditLimit);
		return h;
	}

	
}

