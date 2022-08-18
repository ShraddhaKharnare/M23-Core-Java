package com.cg.queue;

import java.util.ArrayDeque;

public class QueueEx2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayDeque a =new ArrayDeque();
		a.add(11);
		a.add("Hey");
		System.out.println(a);
		a.addFirst(12);
		a.addLast("World");
		System.out.println(a);
	}

}
