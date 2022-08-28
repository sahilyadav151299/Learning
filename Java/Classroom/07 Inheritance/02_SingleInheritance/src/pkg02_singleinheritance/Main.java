
package pkg02_singleinheritance;

class Animal
{
    public void eat()
    {
        System.out.println("Eats");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Animal a = new Animal();
        a.eat();
        
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
