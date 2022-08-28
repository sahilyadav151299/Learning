
package pkg09_throwscase2;

import java.io.IOException;

// You declare the exception i.e. specifying throws with the method.

class ExceptionHandling
{
    void method1() throws IOException
    {
        throw new IOException("Device Error");
    }
    
    void method2() throws IOException
    {
        System.out.println("No Error");
    }
}

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.method2();
        obj.method1();
    }
}

