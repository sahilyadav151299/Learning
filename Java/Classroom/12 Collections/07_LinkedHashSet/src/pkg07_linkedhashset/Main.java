
package pkg07_linkedhashset;

// Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
// It inherits HashSet class and implements Set interface.
// Java LinkedHashSet class contains unique elements only like HashSet.
// Java LinkedHashSet class provides all optional set operation and permits null elements.
// Java LinkedHashSet class is non synchronized.
// Java LinkedHashSet class maintains insertion order.

import java.util.LinkedHashSet;

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> weekDays = new LinkedHashSet();
        
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
    }  
}