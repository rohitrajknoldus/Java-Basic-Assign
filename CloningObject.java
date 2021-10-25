// Question No-16
package javaCore;
public class CloningObject implements Cloneable
{  
	int employee_ID;  
	String name;  
	CloningObject(String name, int employee_ID)
	{  
		this.employee_ID=employee_ID;  
		this.name=name;  
	}
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}
	public static void main(String[] args)
	{
		try{  
			CloningObject c1=new CloningObject("Rohit Raj", 1618);
			CloningObject c2=(CloningObject)c1.clone();  
			System.out.println("Original: Employee ID- "+c1.employee_ID+" & Name- "+c1.name);  
			System.out.println("Duplicate: Employee ID- "+c2.employee_ID+" & Name- "+c2.name);
		}
		catch(CloneNotSupportedException c){}
	}
}
