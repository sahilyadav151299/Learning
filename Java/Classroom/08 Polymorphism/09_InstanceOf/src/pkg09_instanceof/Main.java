
package pkg09_instanceof;

// Used to test whether the object is an instance of the specified type (class/subclass/interface).
// Also known as type comparison operator because it compares the instance with type. 
// It returns either true or false. 
// If we apply the instanceof operator with any variable that has null value, it returns false.

interface Drawable {}

class Circle implements Drawable
{
    public void draw() { System.out.println("Circle can be draw"); }
}

class Triangle implements Drawable
{
    public void draw() { System.out.println("Triangle can be draw"); }
}
        
public class Main 
{
    public static void typeCheck(Drawable object)   // Upcasting  Parent -> Child
    {
        if( object instanceof Circle)
        {
            Circle obj = (Circle) object;           // Downcasting
            obj.draw();
        }
        
        if( object instanceof Triangle)
        {
            Triangle obj = (Triangle) object;       // Downcasting
            obj.draw();
        }
    }
    
    public static void main(String[] args) 
    {
        Drawable d1 = new Circle();
        Drawable d2 = new Triangle();
        
        Main.typeCheck(d1);
        Main.typeCheck(d2);
    }
}
