package com.cg.lambdaexprsn;

import java.io.File;
import java.io.FileFilter;



public class FileFilterLambda
{

	public static void main(String[] args) 
	{
		//lambda expression for searching the file in the given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".pptx");
        File dir=new File("C:\\Users\\100tx\\Downloads");
	    File contents[]=dir.listFiles(filter);
	    
	    /*enhanced for loop
	    if any particular extension file is open on your system then 
	    you will get that file in two times with one file will in $ sign*/
	    for(File i:contents)
	    {
	    	System.out.println(i);
	    }
	
	}

}
