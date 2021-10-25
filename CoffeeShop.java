// Question No-11
package javaCore;
import java.util.*;
public class CoffeeShop 
{	
	static String str;
    static int price;
    static  int token_no;
    void Cashier()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t Welcome to Coffee Shop\n ");
        System.out.println("Quote of the day:- ''LIFE BEGINS AFTER COFFEE''\n");
        System.out.println("Here's few different flavours for your Coffee:");
        System.out.println("Black Coffee \t Price = 140/- each\n" +
                "Cappuccino \t Price = 160/- each\n" +
                "Cold Coffee \t Price = 120/- each\n");
        System.out.println("Enter Your Favourite Coffee Name  :");
        str=sc.nextLine();
        System.out.println("Please Pay The Amount of ["+str+"]=");
        price = sc.nextInt();
    }
    void Customer() throws InterruptedException
    {
        if ((Objects.equals(str, "Black Coffee")) && (price == 140))
        {
            token_no=101;
            System.out.println("Your Token no is :"+token_no+"\n");
            System.out.println("Your Payment Is Successful\nPlease Wait a While We're Getting Ready Your Order:\n");
            Thread.sleep(15000);
        }
        else if((Objects.equals(str, "Cappuccino")) &&(price == 160))
        {   
        	token_no=201;
            System.out.println("Your Token no is :"+token_no+"\n");
        	System.out.println("Your Payment Is Successful\nPlease Wait a While We're Getting Ready Your Order:\n");
        	Thread.sleep(15000);
        }
        else if((Objects.equals(str, "Cold Coffee"))&&(price == 120))
        {
            token_no=301;
            System.out.println("Your Token no is :"+token_no+"\n");
            System.out.println("Your Payment Is Successful\nPlease Wait a While We're Getting Your Order Ready:\n");
            Thread.sleep(15000);
        }
        else
        {
        	System.out.println("Oops :( Something Went Wrong\n ");
            System.out.println("Either You Entered Wrong Name Or You Haven't Paid Right Amount  :");
        }
    }
    void Barista()
    {
        if (token_no == 101) {
            System.out.println("Please Have Your Order ["+str+"]");
        }
        if (token_no == 201) {
            System.out.println("Please Have Your Order ["+str+"]");
        }
        if (token_no == 301) {
            System.out.println("Please Have Your Order ["+str+"]");
        }
    }
	public static void main(String[] args) throws InterruptedException {
		CoffeeShop shop= new CoffeeShop();
        shop.Cashier();
        shop.Customer();
        shop.Barista();
	}
}
