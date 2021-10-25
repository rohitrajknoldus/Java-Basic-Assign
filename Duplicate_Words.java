//Question no-6
package javaCore;
public class Duplicate_Words
{
	public static void main(String[] args) 
	{
		 String str = "once a time once while";  
		 System.out.println("original string: "+str);
	     int count;  
	     str = str.toLowerCase();    
	     String words[] = str.split(" ");    
	            
	     System.out.print("duplicate word: ");     
	       for(int i = 0; i < words.length; i++) 
	       {    
	           count = 1;    
	           for(int j = i+1; j < words.length; j++) 
	           {    
	               if(words[i].equals(words[j])) 
	               {    
	                   count++;    
	                   words[j] = "0";    
	               }    
	           }
	           if(count > 1 && words[i] != "0")    
	               System.out.println(words[i]); 
	       }
	}
}

	        
