import java.util.Scanner;

public class CharProgram 
{
	public static void main(String[] args) 
	{
		//char x='a';                                         //compile-time input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value if x: ");
	
		char x=s.next().charAt(0);                              //Run-time input
		System.out.println("The character is: "+x);
		s.close();
	}
}
