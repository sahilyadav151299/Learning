
package pkg03_linkedlist;

// Java LinkedList class uses a doubly linked list to store the elements. 
// It inherits the AbstractList class and implements List and Deque interfaces.
// Java LinkedList class can contain duplicate elements.
// Java LinkedList class maintains insertion order.
// Java LinkedList class is non synchronized.
// Java LinkedList class can be used as a list, stack or queue.
// Manipulation is fast because no shifting needs to occur.

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;

public class Main 
{
    public static void main(String[] args) 
    {
        LinkedList<String> maleSingers = new LinkedList<String>();
        
        maleSingers.add("Arijit Singh");
        maleSingers.add("Aatif Aslam");
        maleSingers.add("Kelash Kher");
        maleSingers.add("Ayushyaman Khurana");
        
        Iterator<String> itr = maleSingers.iterator();
        
        System.out.println("Male Singers");
        
        while(itr.hasNext())
            System.out.println(itr.next());
        
        LinkedList<String> femaleSingers = new LinkedList<String>();
        
        femaleSingers.add("Neethi Mohan");
        femaleSingers.add("Palak Muchhal");
        femaleSingers.add("Sheraya Ghoshal");
        femaleSingers.add("Raja Kumari");
        
        System.out.println("\nFemale Singers");
        
        for(String name : femaleSingers)
            System.out.println(name);
        
        LinkedList<String> singers = new LinkedList<String>();
        
        singers.addAll(maleSingers);
        singers.addAll(femaleSingers);
        
        Collections.sort(singers);
        
        System.out.println("\nAll Singers");
        
        for(int i=0; i<singers.size(); i++)
            System.out.println(singers.get(i));
        
        LinkedList<String> rappers = new LinkedList<>();
        
        rappers.add("Yo Yo Honey Singh");
        rappers.add("Badshah");
        rappers.add("Guru Randhava");
        rappers.add("Hardy Sandhu");
        
        singers.addAll(0, rappers);
        
        System.out.println("\nModified Names");
        
        for(String name : singers)
            System.out.println(name);
        
        singers.removeAll(rappers);
        System.out.println(singers);
        
        singers.remove();
        System.out.println(singers);
        
        singers.remove("Raja Kumari");
        System.out.println(singers);
        
        singers.removeFirst();
        singers.removeLast();
        System.out.println(singers);
        
        Iterator reverse = singers.descendingIterator();
        
        while(reverse.hasNext())
            System.out.println(reverse.next());
        
        singers.clear();
        System.out.println(singers);
    }  
}
