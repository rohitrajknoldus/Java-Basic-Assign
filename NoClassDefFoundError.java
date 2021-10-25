//Question no- 14-A
package javaCore;
class test
{
	void hello()
		{
			System.out.println("hello Rohit");
		}	
}

// if we will remove test class then it will send NoClassDefFoundError


public class NoClassDefFoundError 
{
		public static void main(String args[])
		{
			test error = new test();
			error.hello();
		}
}