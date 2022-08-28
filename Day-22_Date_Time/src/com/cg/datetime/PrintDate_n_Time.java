package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class PrintDate_n_Time 
{
	public static void main(String[] args) 
	{
		//LocalDate l=LocalDate.now();
		//LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate t=LocalDate.of(2022, Month.AUGUST, 28);
		//System.out.println(l);
		//System.out.println(t);
		System.out.println(dt);
		System.out.println(t);
	}
}
