package com.cg.queue;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queue_Example 
{
	public static void main(String[] args) 
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(11);
		q.add(11);
		q.offer(4);
		q.offer(8);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
	}
}
