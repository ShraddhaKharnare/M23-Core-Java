package com.cg.Inheritance;

public class Person 
{
	

	  int id;
	   void printId(int id)
	   {
	     System.out.println("ID:"+id);
	    }

	}

	 class Student extends Person
	 {
	      void iden()
	         {
	            System.out.print("Student's");
	           }

   }

	 class Teacher extends Person
	 {
	      void iden()
	         {
	            System.out.print("Teacher's");
	           }
	 
	      public void main(String [] args)
	      {
	         Student s=new Student();                        
	         //Teacher t= new Teacher();
	         s.iden();
	         s.printId(11);
	         //t.iden();
	         //t.printId(150);
	      }
	
	       }
