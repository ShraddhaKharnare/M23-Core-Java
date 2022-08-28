package com.cg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class PrintDateusingZoneId 
{

	public static void main(String[] args) 
	{
		LocalTime lt=LocalTime.now(ZoneId.of("Egypt"));
		LocalDateTime ld=LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(lt);
		System.out.println(ld);
		
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}

}
