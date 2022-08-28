
package pkg06_hashset;

// Java HashSet class is used to create a collection that uses a hash table for storage. 
// It inherits the AbstractSet class and implements Set interface.
// HashSet stores the elements by using a mechanism called hashing.
// HashSet contains unique elements only.
// HashSet allows null value.
// HashSet class is non synchronized.
// HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
// HashSet is the best approach for search operations.
// The initial default capacity of HashSet is 16, and the load factor is 0.75.

import java.util.HashSet;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        HashSet<String> weekDays = new HashSet();
        
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");     // Ignores Duplicate
        
        for(String day : weekDays)
            System.out.println(day +" "+day.hashCode());
        
        weekDays.remove("Monday");
        weekDays.remove("Sunday");
        
        System.out.println(weekDays);
        
        weekDays.removeAll(weekDays);
        System.out.println(weekDays);
        
        ArrayList<String> list = new ArrayList();
        
        list.add("Harsh Beniwal");
        list.add("Ashish Chanchlani");
        list.add("Bhuvan Bum");
        list.add("Round 2 Hell");
        
        System.out.println(list);
        
        weekDays.addAll(list);
        
        System.out.println(weekDays);
    }  
    
    
}
