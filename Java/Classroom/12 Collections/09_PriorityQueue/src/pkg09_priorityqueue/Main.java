
package pkg09_priorityqueue;

// Queue interface orders the element in FIFO(First In First Out) manner. 
// PriorityQueue class provides the facility of using queue. 
// But it does not orders the elements in FIFO manner. 
// It inherits AbstractQueue class.

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class Main 
{
    public static void main(String[] args) 
    {
        Queue<String> vaccineLane1 = new PriorityQueue();
      
        vaccineLane1.add("Doctors");
        vaccineLane1.add("Helpers");
        vaccineLane1.add("Social Workers");
        vaccineLane1.add("Soliders");
        vaccineLane1.add("Senior Citizens");
        vaccineLane1.add("Childers");
        vaccineLane1.add("Students");
        vaccineLane1.add("Youngers");
        
        Iterator itr1 = vaccineLane1.iterator();
        
        while(itr1.hasNext())
            System.out.println(itr1.next());
        
        System.out.println(vaccineLane1.add("Rest"));           
        
        System.out.println(vaccineLane1.offer("Front Liners"));
        
        System.out.println(vaccineLane1);
        
        System.out.println(vaccineLane1.element());
        
        System.out.println(vaccineLane1.peek());
        
        System.out.println(vaccineLane1.remove());
        
        System.out.println(vaccineLane1.poll());
        
        System.out.println(vaccineLane1);
    }  
}
