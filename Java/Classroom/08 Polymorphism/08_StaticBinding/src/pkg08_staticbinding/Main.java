
package pkg08_staticbinding;

// When type of the object is determined at compile-tile, it is known as static binding.
// Determined By Compiler, not by JVM.
// Compiler chekcs type of the reference rather than type of the object.
// Also known as Early Binding.
// If there is any private/final/static method in a class, there is static binding.

class Vehicle
{
    public static void run() { System.out.println("All Vehicles Run"); }
}

class Bike extends Vehicle
{
    public static void run() { System.out.println("Bike Runs"); }
}

public class Main 
{   
    public static void main(String[] args) 
    {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Bike();
        Bike v3 = new Bike();
        
        v1.run();
        v2.run();
        v3.run();
    }
}

