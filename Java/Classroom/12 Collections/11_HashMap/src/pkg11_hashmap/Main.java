
package pkg11_hashmap;

// A map contains values on the basis of key, i.e. key and value pair. 
// Each key and value pair is known as an entry. 
// A Map contains unique keys, but you can have duplicate values.
// Map(Interface) <-- AbstractMap(Class) <-- HashMap (Class)

// Java HashMap contains values based on the key.
// Java HashMap contains only unique keys.
// Java HashMap may have one null key and multiple null values.
// Java HashMap is non synchronized.
// Java HashMap maintains no order.
// The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

import java.util.HashMap;
import java.util.Map;

public class Main 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> students = new HashMap<Integer, String>();
        
        students.put(101, "Aditya Dubey");
        students.put(102, "Afreen Khan");
        students.put(103, "Deepika Nagar");
        students.put(104, "Divyansh Yadav");
        students.put(105, "Sahil Yadav");
        students.put(106, "Shubham Dhurvey");
        
        System.out.println("Traversal of HashMap : ");
        
        for(Map.Entry name : students.entrySet())
            System.out.println(name.getKey()+" "+name.getValue());
        
        System.out.println(students);
        System.out.println(students.entrySet());
        
        System.out.println(students.containsKey(100));  // false key is not present
        System.out.println(students.containsKey(105));  // true key is present
        
        System.out.println(students.containsValue("Sahil"));        
        System.out.println(students.containsValue("Sahil Yadav"));
        
        System.out.println(students.get(105)); // returns value
        System.out.println(students.isEmpty());
        
        System.out.println(students.keySet());
        System.out.println(students.values());
  
    }  
}

