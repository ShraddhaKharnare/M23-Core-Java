
package com.cg.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OwnCustom
{
	int accept();
}

class C
{
	@OwnCustom(accept=25)
	public void display()
	{
		System.out.println("HEY there, I am Custom Annotaion");
	}
}

public class CustAnnotation 
{

	public static void main(String[] args) throws Exception
	{
		C c=new C();
		//c.display();
		Method m=c.getClass().getMethod("display");
	    OwnCustom obj=m.getAnnotation(OwnCustom.class);
	    System.out.println(obj.accept());
	}

}
