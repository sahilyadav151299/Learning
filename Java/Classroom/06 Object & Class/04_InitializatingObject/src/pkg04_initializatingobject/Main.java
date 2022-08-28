
package pkg04_initializatingobject;

// By Constructor
class Demo1
{
    int age;
    String name;
    
    Demo1(int getAge, String getName)
    {
        age = getAge;
        name = getName;
    }        
    
    public void showDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    }        
}

// By Method
class Demo2
{
    int age;
    String name;
    
    public void takeInput(int getAge, String getName)
    {
        age = getAge;
        name = getName;
    }        
    
    public void showDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    } 
}

// By Reference Variable
class Demo3
{
    int age;
    String name;
   
    public void showDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    } 
}

public class Main 
{
    public static void main(String[] args) 
    {
        Demo1 obj1 = new Demo1(20, "Sahil");
        
        Demo2 obj2 = new Demo2();
        obj2.takeInput(22, "Vishal");
        
        Demo3 obj3 = new Demo3();
        
        obj3.age = 20;
        obj3.name = "Sonu";
        
        
        obj1.showDetails();
        obj2.showDetails();
        obj3.showDetails();
    }  
}
