
package pkg05_arrayofobjects;

import java.util.Scanner;

class Customer
{
    String name;
    int account;
    int balance;
    
    public void takeDetails()
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter Name, Account no. & Balance");
        
        name = kb.nextLine();
        account = kb.nextInt();
        balance = kb.nextInt();
    }        
    
    public void showDetails()
    {
        System.out.println("Name : "+name+" Account no : "+account+" Balance : "+balance);
    }        
}

public class Main 
{
    public static void main(String[] args) 
    {
        Customer Crr[] = new Customer[3];
        
        for(int i=0; i<Crr.length; i++)
        {
            Crr[i] = new Customer();
            Crr[i].takeDetails();
        }
        
        for(int i=0; i<Crr.length; i++)
        {
            Crr[i].showDetails();
        }
    }    
}
