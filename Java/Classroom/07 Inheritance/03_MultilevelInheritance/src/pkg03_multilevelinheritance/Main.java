
package pkg03_multilevelinheritance;

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

class Puppy extends Dog
{  
    public void weep()
    {
        System.out.println("Weeping");
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
        
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
