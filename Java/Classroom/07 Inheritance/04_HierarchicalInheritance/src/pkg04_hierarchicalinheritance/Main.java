
package pkg04_hierarchicalinheritance;

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

class Cat extends Animal
{  
    public void meow()
    {
        System.out.println("Meowing");
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
        
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
