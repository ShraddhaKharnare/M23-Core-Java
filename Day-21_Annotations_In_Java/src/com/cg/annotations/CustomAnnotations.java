package com.cg.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
 @interface Cust
{	
	String print() default "Shraddha";           //abstract method  
	int speed()  default 50;                     //multiple-value annotation
	int percentage() default 80;
}
class D
{
	@Cust (print="Hello Students",speed=60,percentage=80)
	public void display()
		{
			System.out.println("This is an custom annotation.");
		}
	}
	
public class CustomAnnotations 
{
public static void main(String[] args) throws Exception
{
	D d=new D();
	d.display();
	Method m=d.getClass().getMethod("display");
    Cust obj=m.getAnnotation(Cust.class);
    
    System.out.println(obj.print());
    System.out.println(obj.speed());
	System.out.println(obj.percentage());  
	}
}