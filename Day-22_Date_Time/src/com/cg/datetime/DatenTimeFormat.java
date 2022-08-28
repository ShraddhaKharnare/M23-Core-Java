package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatenTimeFormat 
{
	public static void main(String[] args) 
	{
		LocalDateTime datetime=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
		String var=datetime.format(df);
		System.out.println(var);


	}
}
