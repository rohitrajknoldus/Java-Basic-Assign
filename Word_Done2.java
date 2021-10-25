//Question no- 10(b)
package javaCore;

import java.util.*;

public class Word_Done2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		int len = word.length();
		do
		{
		if(word.charAt(0) == word.charAt(word.length() - 1))
		{
		System.out.println("First & last character are same of the word: " + word);
		}
		else
		{
			System.out.println("First & last character are not same of the word: " + word);
		}
		word = sc.next();
		}
		while(!word.equals("done"));
	}
}
