//Question no-10(a)
package javaCore;

import java.util.Scanner;

public class Word_Done {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		int len = word.length();
		while(!word.equals("done"))
		{
		if(word.charAt(0) == word.charAt(len) - 1)
		{
		System.out.println("First & last character are same of the word: " + word);
		}
		else
		{
		System.out.println("First & last character are not same of the word: " + word);
		}
		word = sc.next();
		}

	}

}
