package com.cgScanBuff;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		System.out.println("Enter a String");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String str= sc.nextLine();

		System.out.println("the string you entered is:"+str);

	}

}
