package com.cg.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDateByusingPlus 
{
	public static void main(String[] args) 
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(5);
		System.out.println(date2);
		long df=ChronoUnit.DAYS.between(date1, date2);
	    System.out.println(df);
	}

}
