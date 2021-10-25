//Question no-4
package javaCore;

import java.util.Scanner;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		String rev_str = "";
		for (int i = str.length() - 1; i >= 0; --i) 
		{
			rev_str += str.charAt(i);
		}
		System.out.println(rev_str);
	}
}
