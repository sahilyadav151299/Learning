
package pkg02_interface;

// Interface used to achieve abstraction & multiple inheritance.
// It cannot be instantiated.
// Variable        -> By default public static final
// Abstract Method -> By default public abstract
// Default/Static Method with body From Java8
// Private Method with body From Java9

interface Drawable
{
    void draw();
    void area(int x);
}

class Circle implements Drawable
{
    public void draw() { System.out.println("Cricle is Drawing"); }
    
    public void area(int x) { System.out.println("Area : "+(3.14*x*x)); }
}

class Square implements Drawable
{
    public void draw() { System.out.println("Square is Drawing"); }
    
    public void area(int x) { System.out.println("Area : "+(x*x)); }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Drawable shape1 = new Circle();
        Drawable shape2 = new Square();
        
        shape1.draw();
        shape1.area(2);
        
        shape2.draw();
        shape2.area(4);
    }
}