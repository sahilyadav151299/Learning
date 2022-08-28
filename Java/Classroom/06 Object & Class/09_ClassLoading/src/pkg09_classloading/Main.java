
package pkg90_classloading;

// 1) Calling of static method of a class loads the class.
class Demo1
{
    public static void show()
    {
        System.out.println("Demo1 loads");
    }        
}

// 2) Using a static variable of a class loads the class.
class Demo2
{
    static int wheels;
    
    static
    {
        wheels = 4;
        System.out.println("Demo2 loads");
    }    
}

// 3) Creation of object of a class loads the class.
class Demo3
{
    Demo3()
    {
        System.out.println("Demo3 loads");
    }        
}

// 4) Reflextion API method forName() loads the class.
class Demo4
{
    static
    {
        System.out.println("Demo4 loads");
    }
}

public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Demo1.show();
        Demo2.wheels = 8;
        new Demo3();
        Class.forName("pkg90_classloading.Demo4");   
    }    
}
