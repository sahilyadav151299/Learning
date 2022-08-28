
package pkg03_assignment;

public class Main 
{
    public static void main(String[] args) 
    {
        // Short Hand Operators
        
        int val = 5;
        
        int val1 = val;              // Assignment Operator
        System.out.println(val1);
        
        val += 10;                   // Addition Operator
        System.out.println(val);
        
        val -= 5;                    // Subtraction Operator
        System.out.println(val);
        
        val *= 2;                    // Multiplication Operator
        System.out.println(val);
        
        val /= 4;                    // Division Operator
        System.out.println(val);
        
        val %= 2;                    // Modulo Operator
        System.out.println(val);
        
        
        // 10 By Default Int 
        // 0.0 By Default Double;
        
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);   //  a + b = 30 which is new no. by default int
        
        float x = 2.2F;
        float y = 2.8F;
        float z = x + y;
    
    }  
}
