//Question no- 8
package javaCore;

public class Static_Block 
{
	static String firstName = "Rohit";
    static String lastName = "Raj";
    static int age = 21;
    private static void print()
    {
    	System.out.println("I'm From static method");
    }
    public static void main(String[] args) 
    {
        System.out.println("First name: "+firstName);
        System.out.println("Last Name " + lastName);
        System.out.println("Age " + age);
        print();
    }
    static {
        System.out.println("I'm from static block");
    }
}