
package pkg04_public;

// Public access modifier is accessible everywhere.

class PublicMode
{
    public int data = 100;
    
    public void getData()
    {
        System.out.println("From Method : "+data);
    }
}

public class Main 
{    
    
    public static void main(String[] args) 
    {
        PublicMode object = new PublicMode();
        
        System.out.println("From Outside the class : "+object.data);
        object.getData();
    }   
}
