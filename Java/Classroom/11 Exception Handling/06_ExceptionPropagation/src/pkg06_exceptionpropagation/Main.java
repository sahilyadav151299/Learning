
package pkg06_exceptionpropagation;

// By default Unchecked Exceptions are forwarded in calling chain (propagated).

class ExceptionHandling
{
    void A()
    {
        System.out.println("In A up");
        int data = 50/0;
        System.out.println("In A Down");
    }
    void B()
    {
        System.out.println("In B Up");
        A();
        System.out.println("In B Down");
    }
    void C()
    {
        System.out.println("In C Up");
        try
        {
            B();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("In C Down");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.C();
    }
}

// Exception occurs in A() method where it is not handled,
// so it is propagated to previous B() method where it is not handled, 
// again it is propagated to C() method where exception is handled.

// Exception can be handled in any method in call stack 
// either in main() method, A() method, B() method or C() method.

// By default, Checked Exceptions are not forwarded in calling chain (propagated).
// Gives Compile Time Error.


