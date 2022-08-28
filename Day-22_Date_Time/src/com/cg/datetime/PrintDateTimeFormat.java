package com.cg.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateTimeFormat 
{
	public static void main(String[] args)
	{
		String datetime="2022-08-28 16:16";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime l=LocalDateTime.parse(datetime, df);
	    System.out.println(l);
	}

}
