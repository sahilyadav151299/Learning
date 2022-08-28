
package pkg07_staticmethod;

// A static method belongs to the class rather than the object of a class.

import java.util.Scanner;

// A static method can be invoked without the need for creating an instance of a class.
// A static method can access static data member and can change the value of it.
// A static method can access non-static data member by creating object of the same class only.
// this and super cannot be used in static context

class Math
{
    public static int add(int a, int b)
    {
        return a+b;
    }    
    
    public static int sub(int a, int b)
    {
        return a-b;
    }
    
    public static int div(int a, int b)
    {
        return a/b;
    }
    
    public static int mul(int a, int b)
    {
        return a*b;
    }
    
    public static int cube(int x)
    {
        return x*x*x;
    }
    
    public static int square(int x)
    {
        return x*x;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Math.add(10, 20));
        System.out.println(Math.sub(70, 10));
        System.out.println(Math.mul(15, 15));
        System.out.println(Math.div(50, 25));
        System.out.println(Math.cube(4));
        System.out.println(Math.square(9));
    }    
}
