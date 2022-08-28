
package pkg01_abstractclass;

// A class which is declared as abstract is known as an abstract class. 
// It can have abstract and non-abstract methods with body. 
// It needs to be extended and its method implemented. 
// An abstract class must be declared with an abstract keyword.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which can't be overriden.

abstract class Bank
{
    String bankName;
    static int count = 0;
    
    Bank(String bankName) 
    { 
        this.bankName = bankName;
        System.out.println("Bank Created With Name : "+bankName);
        count++;
    }
    
    final public static void totalBank()
    {
        System.out.println("Total Banks : "+count);
    }
    
    abstract void rateOfInterest();
}

class SBI extends Bank
{
    public SBI(String bankName) { super(bankName); }
   
    public void rateOfInterest() { System.out.println("ROI : 9");}
}

class BOI extends Bank
{
    public BOI(String bankName) { super(bankName); }
    
    public void rateOfInterest() { System.out.println("ROI : 8");}
}

public class Main 
{
    public static void main(String[] args) 
    {
        Bank b1 = new SBI("State Bank of India");
        Bank b2 = new BOI("Bank of India");
        
        System.out.println(b1.bankName);
        b1.rateOfInterest();
        
        System.out.println(b2.bankName);
        b2.rateOfInterest();
    }
}