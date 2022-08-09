package com.cg.Inheritance;

 class Person
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


       public static void main(String [] args)
          {
             Student s=new Student();
             s.iden();
             s.printId(11);
             Teacher t= new Teacher();
             t.iden();
             t.printId(12);
          }
  }
           



