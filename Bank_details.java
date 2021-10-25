//Question no- 9
package javaCore;
class Bank
{
	String name;
    Bank(String name)
    {
       this.name = name;
    }
    public void getDetails()
    {
        System.out.println("Name " + name);
    }
}
class SBI extends Bank
{
    public SBI(String name)
    {
        super(name);
    }
    public void getDetails()
    {
        super.getDetails();
    }
}
class BOI extends Bank
{
    public BOI(String name)
    {
        super(name);
    }
    public void getDetails() {
        super.getDetails();
    }
}
class ICICI extends Bank
{
    public ICICI(String name) 
    {
        super(name);
    }
    public void getDetails() {
        super.getDetails();
    }
}
public class Bank_details {
    public static void main(String[] args) {
        Bank b = new Bank("Reserve Bank of India");
        SBI sbiBranch = new SBI("State Bank of India");
        BOI boiBranch = new BOI("Bank Of India");
        ICICI iciciBranch = new ICICI("Industrial Credit and Investment Corporation of India");
        b.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }

}
