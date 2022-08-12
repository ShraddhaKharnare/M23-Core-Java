package com.cg.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		
		int size=s.nextInt();
		//array declaration
		int arr[]=new int[size];
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" index");
			arr[i]=s.nextInt();
			}
		
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
			}
		}
	
	}
	


