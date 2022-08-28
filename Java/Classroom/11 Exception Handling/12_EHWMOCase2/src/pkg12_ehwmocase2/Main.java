
package pkg12_ehwmocase2;

// If the superclass method declares an exception, 
// subclass overridden method can declare same, subclass exception or no exception 
// but cannot declare parent exception.

class SuperClass
{
    void method() throws ArithmeticException
    {
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass
{
    void method() throws ArithmeticException
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
