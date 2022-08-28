
package pkg10_arraydeque;

// Deque Interface is a linear collection that supports element insertion and removal at both ends. 
// Deque is an acronym for "double ended queue".

// ArrayDeque class provides the facility of using deque and resizable-array. 
// It inherits AbstractCollection class and implements the Deque interface.
// Unlike Queue, we can add or remove elements from both sides.
// Null elements are not allowed in the ArrayDeque.
// ArrayDeque is not thread safe, in the absence of external synchronization.
// ArrayDeque has no capacity restrictions.
// ArrayDeque is faster than LinkedList and Stack.

import java.util.ArrayDeque;
import java.util.Deque;

public class Main 
{
    public static void main(String[] args) 
    {
        Deque<String> myFamily = new ArrayDeque();
        
        myFamily.add("Grand Father");
        myFamily.add("Grand Mother");      
        myFamily.add("Father");
        myFamily.add("Mother");
        myFamily.add("Uncle");
        myFamily.add("Aunt");
       
        System.out.println(myFamily);
        
        myFamily.addFirst("Great Grand Father");
        
        System.out.println(myFamily);
        
        System.out.println(myFamily.contains("Me"));
        
        // Accessing of Element 
        
        System.out.println(myFamily.element());
        
        System.out.println(myFamily.getFirst());
        
        System.out.println(myFamily.getLast());
        
        System.out.println(myFamily.peek());
        
        System.out.println(myFamily.peekFirst());
        
        System.out.println(myFamily.peekLast());
        
        // Removal of Elements
        
        System.out.println(myFamily.poll());
        
        System.out.println(myFamily.pollFirst());
        
        System.out.println(myFamily.pollLast());
        
        System.out.println(myFamily.remove());
        
        System.out.println(myFamily);
        
        System.out.println(myFamily.pop());
        
        System.out.println(myFamily);
    }  
}