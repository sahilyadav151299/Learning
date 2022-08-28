
package pkg01_unary;

import com.sun.prism.impl.BufferUtil;

public class Main 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = -10;
        
        System.out.println(-a);   // Unary -
        System.out.println(+b);   // Unary +
        
        System.out.println(a++);  // Postfix Increment Operator
        System.out.println(b--);  // Postfix Decrement Operator
        
        System.out.println(++a);  // Pretfix Increment Operator
        System.out.println(--b);  // Pretfix Decrement Operator
        
        boolean bool1 = false;
        boolean bool2 = true;
        
        System.out.println(!bool1);  // Boolean Not Operator
        System.out.println(!bool2);  // Boolean Not Operator
        
    }    
}
