
package pkg04_runtimepolymorphism;

interface Shape { double getArea(); }

interface Figure extends Shape { String getName(); }

class Rectangle implements Figure
{
    private int length;
    private int breadth;
    
    Rectangle(int length, int breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }
    
    public String getName() { return "Rectangle"; }
    
    public double getArea() { return length*breadth; }
}

class Circle implements Figure
{
    private int radius;
    
    Circle(int radius)
    {
        this.radius = radius;
    }
    
    public String getName() { return "Circle"; }
    
    public double getArea() { return 3.14*radius*radius; }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Rectangle shape1 = new Rectangle(4, 5);
        Circle shape2 = new Circle(10);
        
        System.out.println(shape1.getName());
        System.out.println(shape1.getArea());
        
        System.out.println(shape2.getName());
        System.out.println(shape2.getArea());    
    }
}
