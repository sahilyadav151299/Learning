
package pkg16_stack;

// Stack is a class that falls under the Collection framework that extends the Vector class. 
// It also implements interfaces List, Collection, Iterable, Cloneable, Serializable. 
// It represents the LIFO stack of objects.

import java.util.Stack;

public class Main 
{
    public static void main(String[] args) 
    {
        Stack<Integer> value = new Stack<>();
        
        value.push(20);
        value.push(25);
        value.push(30);
        
        System.out.println(value);
        
        value.pop();
        
        System.out.println(value.peek());
    }  
}