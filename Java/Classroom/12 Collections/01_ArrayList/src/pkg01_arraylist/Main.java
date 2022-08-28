
package pkg01_arraylist;

// ArrayList inherits the AbstractList class and implements List interface.
// ArrayList class can contain duplicate elements.
// ArrayList class maintains insertion order.
// ArrayList class is non synchronized.
// ArrayList allows random access because array works at the index basis.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.ListIterator;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Professor");
        myList.add("Berlin");
        myList.add("Tokyo");
        myList.add("Rio");
        myList.add("Denver");
        myList.add("Moscow");
        myList.add("Helsinki");
        myList.add("Nairobi");
        myList.add("Oslo");
        
        // 1) Travers Using Iterator
        
        Iterator itr = myList.iterator();
        
        System.out.println("Traversal 1");
        
        while(itr.hasNext())
        System.out.println(itr.next());
        
        // 2) Travers Using for-each Loop
        
        System.out.println("\nTraversal 2");
        
        for(String name : myList)
            System.out.println(name);
        
        // 3) set(), get() & for loop()
        
        System.out.println("\nTraversal 3");
        
        myList.set(8, "Monica");
        myList.add("Oslo");
        
        for(int i=0; i<myList.size(); i++)
            System.out.println(myList.get(i));
        
        // 4) Sorting & forEach()
        
        System.out.println("\nTraversal 4");
        
        Collections.sort(myList);
        
        myList.forEach( a-> { System.out.println(a); });
        
        // 5) Using ListIterator
        
        System.out.println("\nTraversal 5");
        
        ListIterator<String> myItr = myList.listIterator(myList.size());
        
        while(myItr.hasPrevious())
            System.out.println(myItr.previous());
    }  
}