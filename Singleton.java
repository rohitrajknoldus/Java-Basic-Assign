//Question No- 15
package javaCore;
public class Singleton 
{
	private static Singleton dbms;

	    Singleton() {
	    }

	    public static Singleton getInstance()
	    {
	        if (dbms == null) {
	            dbms = new Singleton();
	        }
	        return dbms;
	    }
	    public void getConnection() {
	        System.out.println("Database working fine.");
	    }
	    public static void main(String[] args) {
	        Singleton db1;
	        db1= Singleton.getInstance();
	        db1.getConnection();
	    }
}
