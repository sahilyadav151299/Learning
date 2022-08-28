
package pkg02_default;

// If you don't use any modifier, it is treated as default by default.
// Default modifier is accessible only within package.

class DefaultMode
{
    int data = 100;
    
    void getData()
    {
        System.out.println("Data : "+data);
    }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        DefaultMode object = new DefaultMode();
        
        System.out.println("Within The Package : "+object.data);
        object.getData();
    }   
}