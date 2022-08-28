
package pkg05_multipleinheritance;

interface Printable { void print(); }

interface Drawable { void draw(); }

class Square implements Printable, Drawable
{
    public void print() { System.out.println("Printing"); }
    
    public void draw() { System.out.println("Drawing"); }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Square shape = new Square();
        
        shape.print();
        shape.draw();
    }
}
