package com.cg.lambdaexprsn;

//Functional Interface
@FunctionalInterface
interface D
{
	String display(String str);  //abstract method
}

public class FunctionalInterfaceImplmentatnDemo {
	public static void main(String[] args)
	{	
     //Lambda Expression with return statement
	 D obj=(String str)->
	  { 
		return str;
		  
	  };
	  System.out.println("Welcom to Lambda Expression concept");
	  obj.display("str");  //we will not get output

	}

}
