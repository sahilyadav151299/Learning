
package pkg14_hashtable;

// Java Hashtable class implements a hashtable, which maps keys to values. 
// It inherits Dictionary class and implements the Map interface.
// A Hashtable is an array of a list. Each list is known as a bucket. 
// The position of the bucket is identified by calling the hashcode() method.
// Java Hashtable class contains unique elements.
// Java Hashtable class doesn't allow null key or value.
// Java Hashtable class is synchronized.
// The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.

import java.util.Hashtable;
import java.util.Map;

public class Main 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer, String> mirzapur = new Hashtable<>();
        
        mirzapur.put(101, "Kaleen Bhaiya");
        mirzapur.put(102, "Munna Bhaiya");
        mirzapur.put(103, "Guddu Bhaiya");
        mirzapur.put(104, "Bablu Bhaiya");
        
        for(Map.Entry pair : mirzapur.entrySet())
            System.out.println(pair.getKey()+" "+pair.getValue());
        
        System.out.println(mirzapur.getOrDefault(105, "Not Found"));
        System.out.println(mirzapur.getOrDefault(103, "Not Found"));
        
        mirzapur.putIfAbsent(105, "Rati Shankar Shukla");
        
        System.out.println(mirzapur.keySet());
        System.out.println(mirzapur.values());
    }  
}
 