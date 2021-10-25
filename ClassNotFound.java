//Question no-14-B
package javaCore;

public class ClassNotFound 
{
		public static void main(String args[]) 
		{
			try
			{
				Class.forName("Error: ClassNotFoundException");
			}
			catch (ClassNotFoundException ex)
			{
				ex.printStackTrace();
			}
		}
}
