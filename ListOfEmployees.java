// Question no-21
package javaCore;
import java.util.*;
public class ListOfEmployees 
{
	private String Id;
    private String Name;
    private String Designation;
    public ListOfEmployees (String Id, String Name, String Designation ) {
        this.Id = Id;
        this.Name = Name;
        this.Designation = Designation;
    }
    public String getId () {
        return Id;
    }
    public void setId (String id){
        Id = id;
    }
    public String getName () {
        return Name;
    }
    public void setName (String name){
        Name = name;
    }
    public String getDestination () {
        return Designation;
    }
    public void setDestination (String destination){
        Designation = destination;
    }

    public String toString()
    {
        return this.Id+"\t"+this.Name+"\t\t"+this.Designation+"\t\t\t";
    }
    public static  void main(String[] args)
    {
        try {

            Map< String, List<ListOfEmployees>> m=new HashMap< String, List<ListOfEmployees> >();
            List<ListOfEmployees> ListForFinance=new ArrayList<ListOfEmployees>();
            Scanner sc=new Scanner(System.in);
            String Id;
            String Name;
            String Destination;
            while(true)
            {
                System.out.print("\nThe Choices:\n1>add\n2>modification\n3>remove\n4>display\n\n");
                System.out.println("Enter the choice: ");
                System.out.println("To quit type -1");
                int num=sc.nextInt();
                if(num == -1)
                {
                    break;
                }
                switch(num)
                {
                    case 1:
                    {
                        System.out.print("\nDestination: ");
                        Destination=sc.next();
                        System.out.print("\nId: ");
                        Id=sc.next();
                        System.out.print("\nName: ");
                        Name=sc.next();

                        ListOfEmployees employee1 = new ListOfEmployees(Id,Name,Destination);
                        ListForFinance.add(employee1);
                        m.put(Destination, ListForFinance);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Type Destination to be modified");
                        Destination=sc.next();
                        System.out.println("Modification values");
                        System.out.print("\nId: ");
                        Id=sc.next();
                        System.out.print("\nName: ");
                        Name=sc.next();

                        Set<String> s=m.keySet();
                        Iterator<String> i=s.iterator();

                        ListOfEmployees employee1=new ListOfEmployees(Id,Name, Destination);
                        ListForFinance.add(employee1);
                        m.put(Destination, ListForFinance);

                        while(i.hasNext())
                        {
                            System.out.println(i.next());
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("ID"+"\t"+"NAME"+"\t\t"+"DESTINATION");
                        Set<String> s=m.keySet();
                        for (String dept : s) {
                            List<ListOfEmployees> employees = m.get(dept);
                            for (ListOfEmployees employee : employees) {
                                System.out.print("\n" + employee + "\n\n");
                            }
                        }
                        break;
                    }

                }
            }
        }
        catch(Exception e) {
            System.out.println("Warning: \n" + "Wrong key Pressed,please enter the correct key");
        }
        System.out.println("Try again (:");
    }
}
