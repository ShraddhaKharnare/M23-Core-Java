package client;

import application.HDFCCurrentAcc;
import application.HDFCSavingAcc;

import framework.CurrentAcc;
import framework.SavingAcc;

public class Client
{	
		public static void main(String[] args)
		{
			
			//minimum account balance limit is 500
			SavingAcc sv=new HDFCSavingAcc(1376,"Shraddha Kharnare",1000,true);
			
			//current limit is 2000
		    CurrentAcc ca=new HDFCCurrentAcc(1376,"Shraddha Kharnare",2000,2000);
		    System.out.println("Saving Acount: ");
		    sv.withdraw(900);
		    System.out.println("Current Account: ");
		    ca.withdraw(500);
		   
	}
}
