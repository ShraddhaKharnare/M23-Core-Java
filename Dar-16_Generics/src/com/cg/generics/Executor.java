package com.cg.generics;

public class Executor 
{

	public static void main(String[] args) 
	{
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic Class Demo");
        obj.sendMessage();
        
        System.out.println();
        
        
        //create an email object to be send using sender
        Email e=new Email();
        e.setFrom("shraddhakharnare@gmail.com");
        e.setTo("skhumbhalkari2tnsif.org");
        e.setSubject("Java Full Stack");
        e.setBody("About Trainning and Placement");
        System.out.println(e.getBody());
        
        
        //create a sender to send this email
        Sender<Email>obj1=new Sender<Email>();
        obj1.setMessage(e);
        
        obj1.sendMessage();

	}
}
