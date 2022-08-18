package com.cg.list;
import java.util.LinkedList;
public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		//ArrayList<Integer>obj=new ArrayList<Integer>();
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(12);
		obj.add(22);
		System.out.println(obj);
		System.out.println(obj.contains(5));
		System.out.println(obj.get(0));
		obj.set(0,13);
		System.out.println(obj);
		//copying one list into another
		Object book;
		book=obj.clone();
		System.out.println(book);
		obj.addFirst(9);
		obj.addLast(19);
		System.out.println(obj);

	}

}
