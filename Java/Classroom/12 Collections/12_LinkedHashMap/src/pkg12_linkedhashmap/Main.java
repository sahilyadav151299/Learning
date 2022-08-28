
package pkg12_linkedhashmap;

// Map(Interface) <-- AbstractMap <-- HashMap <-- LinkedHashMap
// Java LinkedHashMap contains values based on the key.
// Java LinkedHashMap contains unique elements.
// Java LinkedHashMap may have one null key and multiple null values.
// Java LinkedHashMap is non synchronized.
// Java LinkedHashMap maintains insertion order.
// The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

import java.util.LinkedHashMap;
import java.util.Map;

public class Main 
{
    public static void main(String[] args) 
    {
        Map<String, String> stdList = new LinkedHashMap<>();
        
        stdList.put("0127CS171001", "Aditya Dubey");
        stdList.put("0127CS171002", "Afreen Khan");
        stdList.put("0127CS171003", "Deepika Nagar");
        stdList.put("0127CS171004", "Divyansh Yadav");
        stdList.put("0127CS171005", "Sahil Yadav");
        stdList.put("0127CS171006", "Shubham Dhurvey");
        
        for(Map.Entry pairs : stdList.entrySet())
            System.out.println(pairs.getKey()+" "+pairs.getValue());
        
        stdList.remove("0127CS171006");
        stdList.remove("0127CS171005");
        
        System.out.println(stdList.keySet());
        System.out.println(stdList.values());
    }  
}
