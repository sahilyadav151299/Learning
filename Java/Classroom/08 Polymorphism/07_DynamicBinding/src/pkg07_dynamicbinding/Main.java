
package pkg07_dynamicbinding;

// Connecting a method call to the method body is known as binding.
// A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

// When type of the object is determined at run-time, it is known as dynamic binding.
// Determined By JVM, not by compiler.
// JVM chekcs type of the object rather than type of the reference.
// Also known as Late Binding.

class Bank
{
    public int rateOfInterest() { return 0; }
}

class SBI extends Bank
{
    public int rateOfInterest() { return 8; }
}

class BOI extends Bank
{
    public int rateOfInterest() { return 7; }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Bank bank1 = new SBI();
        Bank bank2 = new BOI();
        
        System.out.println(bank1.rateOfInterest());
        System.out.println(bank2.rateOfInterest());
    }
}
