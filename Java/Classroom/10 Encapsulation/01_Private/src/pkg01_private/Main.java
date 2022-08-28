
package pkg01_private;

// Access modifiers specifies the accessibility/scope of a field/method/constructor/class.

// Private access modifier is accessible only within the class.
// If you make any class constructor private, You cannot create the instance of that class from outside the class.

// A class cannot be private/protected except nested class

class PrivateModes
{
    private int data = 100;
    
    private void getData()
    {
        System.out.println("Within The Class : "+data);
    }
    
    public void getDataValue()
    {
        System.out.println("Internally Calls Private Method");
        getData();
    }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        PrivateModes object = new PrivateModes();
        
        object.getDataValue();
    }   
}
