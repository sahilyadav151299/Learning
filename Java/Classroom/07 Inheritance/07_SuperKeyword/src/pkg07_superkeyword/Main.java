
package pkg07_superkeyword;

// The super keyword in Java is a reference variable which is used to refer immediate parent class object.
// Whenever you create the instance of subclass, an instance of parent class is created implicitly 
// which is referred by super reference variable.
// super can be used to refer immediate parent class Instance Variable/Overriden-Method/Constructor.

class Vehicle
{
    int indicators = 4;
    int wheelCount;
    int engineStroke;
    
    public Vehicle(int wheelCount, int engineStroke) 
    {
        this.wheelCount = wheelCount;
        this.engineStroke = engineStroke;
    }
    
    public void getDetails()
    {
        System.out.println("Indicators   : "+indicators);
    }
    
}

class Car extends Vehicle
{
    String color;
    String name;
    
    Car(String color, String name, int wheelCount, int engineStroke)
    {
        super(wheelCount,engineStroke);            // Constructor Calling
        this.color = color;
        this.name = name;
    }
    
    public void getDetails()
    {
        System.out.println("Name         : "+name);
        System.out.println("Color        : "+color);
        System.out.println("WheelCount   : "+super.wheelCount);      // Instance Variable Calling
        System.out.println("EngineStroke : "+super.engineStroke);    // Instance Variable Calling
        super.getDetails();                                          // Overriden Method Calling                       
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Car car1 = new Car("White", "BMW", 4, 4);
        Car car2 = new Car("Red", "Tesla", 4, 6);
        
        car1.getDetails();
        car2.getDetails();
    }    
}
