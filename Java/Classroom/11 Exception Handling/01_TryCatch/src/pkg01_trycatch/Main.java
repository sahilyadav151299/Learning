
package pkg01_trycatch;

// Java try block is used to enclose the code that might throw an exception. 
// It must be used within the method.
// Java try block must be followed by either catch or finally block.

// Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
// The catch block must be used after the try block only.

class ExceptionHandling
{
    int data = 50;
    String name = null;
    
    public void tryCatch1()
    {
        try 
        { 
            int res = data/0; 
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }       
    }
    
    public void tryCatch2()
    {
        try
        {
            System.out.println(name.length());
        }    
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling object = new ExceptionHandling();
        
        object.tryCatch1();
        object.tryCatch2();
    }
}
