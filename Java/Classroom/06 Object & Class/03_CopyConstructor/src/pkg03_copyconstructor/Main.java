
package pkg03_copyconstructor;

// There is no copy constructor in Java. 
// However, we can copy the values from one object to another like copy constructor in C++.

// There are many ways to copy the values of one object into another in Java. They are:

// 1) By constructor
// 2) By assigning the values of one object into another
// 3) By clone() method of Object class

class Demo
{
    int age;
    String name;
    
    Demo()
    {
        age = 0;
        name = "Null";
    }
    
    Demo(int getAge, String getName)            // Parameterized Constructor
    {
        age = getAge;
        name = getName;
    }        
    
    Demo(Demo copy)                             // Constructor to initialize another object
    {
        age = copy.age;
        name = copy.name;
    } 
    
    public void showDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    }        
}     
        
public class Main 
{
    public static void main(String[] args) 
    {
        Demo obj1 = new Demo(20,"Sahil");
        
        Demo obj2 = new Demo(obj1);             // By constructor
        
        Demo obj3 = new Demo();                 
        
        obj3.age = obj2.age;                    // By assigning the values of one object into another
        obj3.name = obj2.name;
        
        
        obj1.showDetails();
        obj2.showDetails();
        obj3.showDetails();
    }  
}
