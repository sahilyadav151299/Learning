
package pkg01_methodoverloading;

//  Methods having same name but different in parameters.
// If we have to perform only one operation, 
// having same name of the methods increases the readability of the program.


// 1) By changing number of arguments

class Add
{
    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    
    public static void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}

// 2) By changing the data type

class Mul
{
    public static void mul(int a, int b)
    {
        System.out.println(a*b);
    }
    
    public static void mul(float a, float b)
    {
        System.out.println(a*b);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Add.add(10, 20);
        Add.add(10, 20, 30);
        
        Mul.mul(10, 20);
        Mul.mul(10.0F, 20.0F);
    }    
}

