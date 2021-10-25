//Question no-3
package javaCore;
public class Remove_Char
{
	static void removeChar(String str, char c)
{
    int j, count = 0, n = str.length();
    char []t = str.toCharArray();
    for (int i = j = 0; i < n; i++)
    {
        if (t[i] != c)
        t[j++] = t[i];
        else
            count++;
    }  
    while(count > 0)
    {
        t[j++] = '\0';
        count--;
    }  
    System.out.print("Second string: ");
    System.out.print(t);
}
	public static void main(String[] args)
	{
		String str="abcdefabcdeabcdaaa";
		System.out.println("Original string: "+str);
		removeChar(str,'a');
}
}
	
