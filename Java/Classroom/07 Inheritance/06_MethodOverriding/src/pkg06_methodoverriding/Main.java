
// Rules for method overriding

// 1) The method must have the same name as in the parent class
// 2) The method must have the same parameter as in the parent class.
// 3) There must be an IS-A relationship (inheritance).

package pkg06_methodoverriding;

// If child class has the same method as declared in the parent class, 
// It is known as method overriding in Java.
// Used for runtime polymorphism.
// Used to provide the specific implementation of a method which is already provided by its superclass.

class Bank
{
    public int rateOfInterest() { return 0;}
}

class SBI extends Bank
{
    public int rateOfInterest() { return 8;}
}

class ICICI extends Bank
{
    public int rateOfInterest() { return 10;}
}

public class Main 
{
    public static void main(String[] args) 
    {
        SBI cust1 = new SBI();
        ICICI cust2 = new ICICI();
        
        int rate1 = cust1.rateOfInterest();
        int rate2 = cust2.rateOfInterest();
        
        System.out.println("SBI : "+rate1);
        System.out.println("ICICI : "+rate2);
    }    
}
