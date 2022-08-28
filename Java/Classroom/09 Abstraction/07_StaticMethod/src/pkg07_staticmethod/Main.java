
package pkg07_staticmethod;

// Static method never get inehrited in sub-class
// By default public

interface Math
{
    double PI = 3.14;
    static int cube(int n) { return n*n*n; }
    double area(double r);
}

class Circle implements Math
{
    public double area(double r) { return Math.PI*r*r; }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Circle c1 = new Circle();
        System.out.println(c1.area(10));
        System.out.println(Math.cube(5));
    }
}
