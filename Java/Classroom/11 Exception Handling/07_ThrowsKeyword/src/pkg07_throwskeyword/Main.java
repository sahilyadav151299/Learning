
package pkg07_throwskeyword;

import java.io.IOException;

// The Java throws keyword is used to declare an exception.
// It gives an information to the programmer that there may occur an exception.
// So it is better for the programmer to provide the exception handling code.
// So that normal flow can be maintained.
// Mainly used to handle the checked exceptions.
// Because unchecked exceptions are automatically propogated to the caller method. 

class ExceptionHandling
{
    void A() throws IOException  
    {
        throw new IOException("Device Error");
    }  
    
    void B() throws IOException
    {
        A();
    }
    void C()
    {
        try
        {
            B();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
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
