package framework;

public abstract class SavingAcc extends BankAcc
{	
	private boolean isSalaried;
	private static final float MINBAL =500;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	
	public void withdraw(float withdrawal ) 
	{
		if(accBal<MINBAL ) 
		{
			System.out.println("your account balance minimum limit is "+MINBAL);
		}
		if(withdrawal>=accBal) 
		{
			System.out.println("your dont have sufficient balance   Your balance is:  "+accBal);
		}
		else 
		{		System.out.println("Withdraw amonut is : "+withdrawal);

		System.out.println("Account no: "+this.getAccNo()+" "+"Account Name : "+this.getAccNm()+" "+"Account Bal: "+(accBal-withdrawal));
		}
	}
}
