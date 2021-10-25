// Question no- 1
package javaCore;
import java.util.*;
public class String_pop
{
static boolean pop(String str) 
{
  int len = str.length();
  for (int i = 0; i < len - 2; i++) 
  {
    if (str.charAt(i) == 'p' && str.charAt(i+2) == 'p')
    return true;
  	}
  	return false;
	}
	public static void main (String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check");
    	String str1 =sc.nextLine();
    	System.out.println(pop(str1));
	  }
}