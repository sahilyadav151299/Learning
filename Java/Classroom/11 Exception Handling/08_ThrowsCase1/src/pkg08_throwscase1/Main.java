
package pkg08_throwscase1;

import java.io.IOException;

// You caught the exception i.e. handle the exception using try/catch.

class ExceptionHandling
{
    void method() throws IOException  
    {
        throw new IOException("Device Error");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        try
        {
            obj.method();
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled");
        }
    }
}