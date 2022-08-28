
package pkg08_staticblock;

// Is used to initialize the static data member.
// It is executed before the main method at the time of classloading.

class Demo
{
    static int x;
    
    static
    {
        System.out.println("In static block");
        x = 100;
    }
    
    public void show()
    {
        System.out.println(x);
    }        
}

public class Main 
{
    static
    {
        System.out.println("Main static block");
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Hello from main");
        
        new Demo().show();
    }    
}
