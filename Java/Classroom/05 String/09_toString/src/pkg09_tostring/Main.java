
package pkg09_tostring;

public class Main 
{
    // The toString() method returns the string representation of the object.
    // If you print any object, java compiler internally invokes the toString() method on the object. 
    // So overriding the toString() method, returns the desired output.    

    int roll;
    String name;
    
    Main(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    
    public String toString()
    {  
        return roll+" "+name;     // Overriding the toString() method otherwise gives Hashcode (String representation of Object)
    } 
    
    public static void main(String[] args) 
    {
        Main s1 = new Main(101,"Sahil");
        Main s2 = new Main(102,"Vishal");
        
        System.out.println(s1);            // Compiler writes here s1.toString() 
        System.out.println(s2);            // Compiler writes here s1.toString()
    }    
}
