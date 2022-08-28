
package pkg05_finalmethod;

// Any method as final, can't be overriden
// final method is inherited but you cannot override it

class Vehicle
{
    final public void windowColor()
    {
        System.out.println("Window Should Be Transparent");
    }
}

class Bike extends Vehicle
{
    public void run()
    {
        System.out.println("Speed Limit 90 kmph");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Bike b = new Bike();
        b.windowColor();
        b.run();
    }
}
