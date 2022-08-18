package com.cg.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Address
{
	private int plotNo;
	private String Street;
	private String Area;
	private String city;
	
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, Area=%s, city=%s]", plotNo, Street, Area, city);
	}
	
	public Address(int plotNo, String street, String area, String city) {
		super();
		this.plotNo = plotNo;
		Street = street;
		Area = area;
		this.city = city;
	}
}

public class MailList
{

	public static void main(String[] args) 
	{
     List<Address>obj=new LinkedList<>();
     //add element to linkedlist
     obj.add(new Address(121,"Lane no2","Kalyan","Mumbai"));
     obj.add(new Address(105,"Puna Link Road","Kalyan","Mumbai"));
     Iterator<Address> i=obj.iterator();
     while(i.hasNext())
   	{
      Object elem=i.next();
      System.out.println(elem+"/n");
	}
    System.out.println();
}
}
