
package pkg08_treeset;

// Java TreeSet class implements the Set interface that uses a tree for storage. 
// It inherits AbstractSet class and implements the NavigableSet interface. 
// The objects of the TreeSet class are stored in ascending order.
// Java TreeSet class contains unique elements only like HashSet.
// Java TreeSet class access and retrieval times are quiet fast.
// Java TreeSet class doesn't allow null element.
// Java TreeSet class is non synchronized.

import java.util.TreeSet;
import java.util.Iterator;

public class Main 
{
    public static void main(String[] args) 
    {
        TreeSet<String> nameSet = new TreeSet();
        
        nameSet.add("Shubham");
        nameSet.add("Vishal");
        nameSet.add("Afreen");
        nameSet.add("Sahil");
        nameSet.add("Divyansh");
        nameSet.add("Anjali");
        nameSet.add("Shivi");
        
        System.out.println("Maintains Ascending Order...");
        
        for(String name : nameSet)
            System.out.println(name);
        
        System.out.println("In Descending Order...");
        
        Iterator itr = nameSet.descendingIterator();
        
        while(itr.hasNext())
            System.out.println(itr.next());
        
        System.out.println("Reversed Element : " +nameSet.descendingSet());
        
        System.out.println("First One : " +nameSet.first());
        
        System.out.println("Last One : " +nameSet.last());
        
        System.out.println("Highest : " +nameSet.pollFirst());
        
        System.out.println("Lowest : " +nameSet.pollLast());
        
        System.out.println(nameSet.getClass());
        
        System.out.println(nameSet.isEmpty());
        
        nameSet.clear();
        
        System.out.println(nameSet.isEmpty());
        
        nameSet.add("A");
        nameSet.add("B");
        nameSet.add("C");
        nameSet.add("D");
        nameSet.add("E");
        nameSet.add("F");
        
        System.out.println("Reverse Set : " +nameSet.descendingSet());
        
        System.out.println("Head Set : " +nameSet.headSet("D",true));      // D Included
        
        System.out.println("Head Set : " +nameSet.headSet("D",false));     // D Excluded
        
        System.out.println("Head Set : " +nameSet.headSet("D"));           // D Excluded
        
        System.out.println("Sub Set : " +nameSet.subSet("A", true, "E", true));     // Both Included
        
        System.out.println("Sub Set : " +nameSet.subSet("A", true, "E", false));    // A Included E Excluded
        
        System.out.println("Sub Set : " +nameSet.subSet("A", false, "E", true));    // A Excluded E Included
        
        System.out.println("Sub Set : " +nameSet.subSet("A", false, "E", false));   // Both Excluded
        
        System.out.println("Sub Set : " +nameSet.subSet("A", "E"));       // E Excluded
        
        System.out.println("Tail Set : " +nameSet.tailSet("C", true));    // C Included
        
        System.out.println("Tail Set : " +nameSet.tailSet("C", false));   // C Excluded  
        
        System.out.println("Tail Set : " +nameSet.tailSet("C"));          // C Included  
    }  
}