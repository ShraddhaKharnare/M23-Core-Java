package com.cg.enums;

import java.util.Scanner;

enum Movies
{
	//enum constants
	KGF2,BRAMHASTRA,PUSHPA,MAJOR;
}
public class EnamWithHelpofSwitchCase 
{
    //enums variable
    Movies movie;
  
	//constructor for the "EnamWithHelpofSwitchCase"
   public EnamWithHelpofSwitchCase(Movies movie)
   {
	   //as Enums var and constructor argument var is same-" use this keyword" 
      this.movie=movie;
   }
 
   
@SuppressWarnings("incomplete-switch")
public  void display()
   	{
     switch(movie)
	  {
	   case KGF2:
		System.out.println("Yash and Srinidhi");
		break;
		
	   case BRAMHASTRA:
			System.out.println("Ranbir and Aliya");
			break;
			
	   case PUSHPA:
			System.out.println("Alluarjun and Rashmika");
			break;
			
	   case MAJOR:
			System.out.println("ADIVI and Sae manjrekar");
			break;
	   }
   	}
	
   
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Movie Name that you want to display");
    String str=s.nextLine();
    //valueof():-to get the constant whose value is passed as an argument while calling this metho
    EnamWithHelpofSwitchCase  obj=new EnamWithHelpofSwitchCase(Movies.valueOf(str));
	obj.display();
	
	}

}
