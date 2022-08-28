
package pkg03_instanceinitializerblock;

// There are three places in java where you can perform operations: Method/Constructor/Block

class A
{
    A() { System.out.println("Parent Class Constructor"); }
}

class B extends A
{
    int value;
    
    B() { System.out.println("Child Class Constructor"); }
    
    {
        value = 100;
        System.out.println("Initializer Block Value : "+value);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        A obj1 = new A();
        B obj2 = new B();
        B obj3 = new B();
    }
}
