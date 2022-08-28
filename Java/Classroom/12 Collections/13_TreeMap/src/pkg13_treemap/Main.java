
package pkg13_treemap;

// Map(Interface) <-- Sortedmap(Interface) <-- Navigablemap(Interface) <-- TreeMap
// Java TreeMap contains only unique elements.
// Java TreeMap cannot have a null key but can have multiple null values.
// Java TreeMap is non synchronized.
// Java TreeMap maintains ascending order.
// Java TreeMap class is a red-black tree based implementation.

import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;
public class Main 
{
    public static void main(String[] args) 
    {
        TreeMap<String, String> stdList = new TreeMap<>();
        
        stdList.put("0127CS171001", "Aditya Dubey");
        stdList.put("0127CS171002", "Afreen Khan");
        stdList.put("0127CS171003", "Deepika Nagar");
        stdList.put("0127CS171004", "Divyansh Yadav");
        stdList.put("0127CS171005", "Sahil Yadav");
        stdList.put("0127CS171006", "Shubham Dhurvey");
        
        for(Map.Entry pairs : stdList.entrySet())
            System.out.println(pairs.getKey()+" "+pairs.getValue());
        
        NavigableMap<String, String> newList = new TreeMap<>(stdList);
        
        System.out.println(newList);
        System.out.println(newList.descendingKeySet());
       
        
    }  
}
