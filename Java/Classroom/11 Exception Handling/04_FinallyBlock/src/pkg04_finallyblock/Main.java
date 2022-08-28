
package pkg04_finallyblock;

// Can be used to put "cleanup" code such as closing a file, closing connection etc.
// Always executed whether exception is handled or not.
// Follows try or catch block.
// If you don't handle exception, before terminating the program, JVM executes finally block(if any).
// For each try block there can be zero or more catch blocks, but only one finally block.
// The finally block will not be executed if program exits(either by calling System.exit() 
// Or by causing a fatal error that causes the process to abort).

class ExceptionHandling
{
    // 1) Exception Doesn't Occur
    
    public void finallyBlock1()
    {
        try
        {
            int data = 100/10;
            System.out.println("Try Block 1");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Final Block 1");
        }
    }
    
    // 2) Exceptio Occured And Handled
    
    public void finallyBlock2()
    {
        try
        {
            int data = 100/0;
            System.out.println("Try Block 2");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Final Block 2");
        }
    }
    
    // 3) Exception Occured But Not Handled
    
    public void finallyBlock3()
    {
        try
        {
            int data = 100/0;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Final Block 1");
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.finallyBlock1();
        obj.finallyBlock2();
        obj.finallyBlock3();
    }
}
