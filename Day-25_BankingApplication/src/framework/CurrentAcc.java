package framework;

public abstract class CurrentAcc extends BankAcc
{
	final private float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s, toString()=%s]", creditLimit, super.toString());
	}

	public void withdraw(float withdrawal ) 
	{
		if(withdrawal>=creditLimit) 
		{
			System.out.println("Your credit limit is :"+creditLimit);
		}
		else {
		System.out.println("Account no: "+this.getAccNo()+" "+"Account Name : "+this.getAccNm()+" "+"Account Bal: "+(accBal - withdrawal));
		}
		
 }
	
	
}
