
package pkg15_vector;

// Vector is like the dynamic array which can grow or shrink its size.
// Vector implements the List interface
// Vector is synchronized.
// Vector contains many legacy methods that are not the part of a collections framework.

import java.util.Vector;
import java.util.Iterator;

public class Main 
{
    public static void main(String[] args) 
    {
        Vector<String> cartoon = new Vector<>();
        
        cartoon.add("Mr. Bean");
        cartoon.add("Noddy");
        cartoon.add("Osworld");
        cartoon.add("Doremon");
        cartoon.add("Tom & Jerry");
        
        Iterator<String> itr = cartoon.iterator();
        
        while (itr.hasNext())
            System.out.println(itr.next());
           
    }  
}