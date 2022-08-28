
package pkg11_ehwmocase1;

// If the superclass method does not declare an exception, 
// subclass overridden method cannot declare the checked exception 
// but it can declare unchecked exception.

class SuperClass
{
    void method()
    {
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass
{
    void method() throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        System.out.println("Sub Class");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        SuperClass obj = new SubClass();
        
        obj.method();
    }
}
