// Question no- 17
package javaCore;

public class TryCatch 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
		    System.out.println("I am from try block");
		     
		    throw new NullPointerException("null occurred");
		}
		catch (ArithmeticException e) 
		{
		    System.out.println("I am from catch block ");
		}
		catch (NullPointerException e) 
		{
		    System.out.println("I am again from catch block");
		}
		finally
		{
		    System.out.println("I am from finally block");
		}
		System.out.println();
		System.out.println("Execution ends here ");
	}
}
