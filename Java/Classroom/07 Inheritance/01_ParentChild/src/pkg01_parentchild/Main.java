
package pkg01_parentchild;

// Inheritance represents the IS-A relationship.
// Which is also known as a parent-child relationship.
// Use For Method Overriding (so runtime polymorphism can be achieved).
// Use For Code Reusability.
// The meaning of "extends" is to increase the functionality.

class Parent
{
    String parentFirstName = "Aaaaa";
    String LastName = "Zzzzz";
    
    public void getParentFirstName()
    {
        System.out.println(parentFirstName);
    }
    
    public void getLastName()
    {
        System.out.println(LastName);
    }
}

class Child extends Parent
{
    String childFirstName;
    
    public Child(String childFirstName) 
    {
        this.childFirstName = childFirstName;
    }
    
    public void getChildFirstName()
    {
        System.out.println(childFirstName);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
         Parent p = new Parent();
         p.getParentFirstName();
         p.getLastName();
         
         Child c1 = new Child("Bbbbb");
         c1.getChildFirstName();
         c1.getLastName();
         
         Child c2 = new Child("Ccccc");
         c2.getChildFirstName();
         c2.getLastName();
    }
}
