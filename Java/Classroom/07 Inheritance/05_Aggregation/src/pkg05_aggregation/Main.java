
package pkg05_aggregation;

// If a class have an entity reference, it is known as Aggregation. 
// Aggregation represents HAS-A relationship.
// Used For Code Reusability.

class Address 
{  
    String city,state,country;  

    public Address(String city, String state, String country) 
    {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }    
} 

class Emp 
{  
    int id;  
    String name;  
    Address address;  

    public Emp(int id, String name,Address address) 
    {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  

    void displayDetails()
    {  
        System.out.println(id+" "+name);  
        System.out.println(address.city+" "+address.state+" "+address.country);  
    }  
}

public class Main 
{
    public static void main(String[] args) 
    {
        Address add1 = new Address("Indore", "MP", "India");
        Address add2 = new Address("Vadodara", "Gujrat", "India");
        
        Emp e1 = new Emp(101, "Chunny", add1);
        Emp e2 = new Emp(102, "Phoolndevi", add2);
        
        e1.displayDetails();
        e2.displayDetails();
    }    
}
