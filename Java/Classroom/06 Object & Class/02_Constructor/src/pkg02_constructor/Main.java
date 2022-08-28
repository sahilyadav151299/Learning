
package pkg02_constructor;

// It is called when an instance of the class is created. 
// At the time of calling constructor, memory for the object is allocated in the memory.
// It is a special type of method which is used to initialize the object.
// Every time an object is created using the new() keyword, at least one constructor is called.
// It calls a default constructor if there is no constructor available in the class. 
// In such case, Java compiler provides a default constructor by default.

// There are two types of constructors in Java: no-arg constructor & parameterized constructor.

// Rules defined for the constructor.

// 1) Constructor name must be the same as its class name.
// 2) A Constructor must have no explicit return type.
// 3) A Java constructor cannot be abstract, static, final, & synchronized.

class Demo
{
    int age;
    String name;
    
    Demo()                                  // Non-Parameterized Constructor
    {
        age = 0;
        name = "Null";
    }        
    
    Demo(int getAge, String getName)       // Parameterized Constructor
    {
        age = getAge;
        name = getName;
    }        
    
    public void showDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
    }        
}
        

public class Main 
{
    public static void main(String[] args) 
    {
        Demo obj1 = new Demo();
        obj1.showDetails();
        
        Demo obj2 = new Demo(20,"Sahil");
        obj2.showDetails();
    }   
}
