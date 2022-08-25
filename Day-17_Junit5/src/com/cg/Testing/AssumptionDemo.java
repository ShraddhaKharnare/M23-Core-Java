package com.cg.Testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo
{
  @Test
  void division()
  {
	  System.setProperty("Shraddha","Meenu");
	  //if assumption is true then printing statement will print otherwise not
	  //Assumptions.assumeTrue("Meenu".equals(System.getProperty("Shraddha")));
	//if assumption is false then printing statementwill print otherwise not
	  Assumptions.assumeFalse("Monika".equals(System.getProperty("Ashwini")));
	  System.out.println("Assumption is false");
  }
}
