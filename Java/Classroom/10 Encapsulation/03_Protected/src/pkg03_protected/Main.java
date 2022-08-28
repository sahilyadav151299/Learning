
package pkg03_protected;

// Protected access modifier is accessible within package 
// And outside the package but through Inheritance/Child class only.
// It can't be applied on the class.

class ProtectedMode
{
    protected int data = 100;
    
    protected void getData()
    {
        System.out.println("Data : "+data);
    }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        ProtectedMode object = new ProtectedMode();
        
        System.out.println("Within The Package : "+object.data);
        object.getData();
    }   
}