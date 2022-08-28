
package pkg06_defaultmethod;

// default method have body
// Make it default using default keyword
// default method can be public only

interface Drawable
{
    void draw();
    
    default void interfaceName() { System.out.println("Drawable Interface"); }
}

class Circle implements Drawable
{
    public void draw() { System.out.println("Drawing Circle"); }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Drawable d = new Circle();
        d.interfaceName();
        d.draw();  
    }
}
