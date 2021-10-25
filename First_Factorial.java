//Question no-5
package javaCore;
import java.util.*;

class First_Factorial
{
	int FirstFactorial(int num) 
	{ 
		if (num != 1) 
		{
			return num*FirstFactorial(num - 1);
		} 
		return num;		
	}
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    First_Factorial f = new First_Factorial();
    System.out.println(f.FirstFactorial(sc.nextInt())); 
  }
}

