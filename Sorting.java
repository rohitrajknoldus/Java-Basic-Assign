//Question No-2
package javaCore;

import java.util.Arrays;

public class Sorting 
{
	static void sort(int[] arr)
	{
		int count=0;
		for(int value: arr)
		{
			if(value==0)
			{
				count++;
			}
		}
		int zero=0;
		while (count-- !=0)
		{
			arr[zero++]=0;
		}
		while (zero < arr.length)
		{
			arr[zero++]=1;
		}
	}
	public static void main(String[] args)
	{
		int []arr= { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
		sort(arr);
		System.out.println("After sorting: "+Arrays.toString(arr));
	}
}
