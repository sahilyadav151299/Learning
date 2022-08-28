
package pkg05_listinterface;

// List in Java provides the facility to maintain the ordered collection. 
// It contains the index-based methods to insert, update, delete and search the elements. 
// It can have the duplicate elements also. We can also store the null elements in the list.
// The List interface is found in the java.util package and inherits the Collection interface. 

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        List<String> subject = new ArrayList<>();
        
        subject.add("Data Structures");
        subject.add("Database Management System");
        subject.add("Operating System");
        subject.add("Computer Networks");
        subject.add("Compiler Design");
        
        ListIterator loop = subject.listIterator();
        
        System.out.println("Forward Direction : ");
        
        while(loop.hasNext())
            System.out.println(loop.next());
        
        System.out.println("\nBackward Direction : ");
        
        while(loop.hasPrevious())
            System.out.println(loop.previous());
       
        Collections.sort(subject); 
        
        System.out.println("\nSorted Subject : ");
        
        for(int i=0; i<subject.size(); i++)
            System.out.println(subject.get(i));
        
        // Converting ArrayList to Array
        
        String sub[] = subject.toArray(new String[subject.size()]);
        
        System.out.println("\nPrinting Array : ");
        System.out.println(Arrays.toString(sub));
        
        // Converting Array to ArrayList
        
        List<String> temp = new ArrayList<>();
        
        for(String name : sub)
        temp.add(name);
        
        System.out.println("\nPrinting ArrayList : ");
        System.out.println(temp);
    }  
}