
package pkg03_typeconversion;

public class Main 
{
    public static void main(String[] args) 
    {
        // Type Conversion == Widening  
        
        // Small primitive type value is automatically accommodated in a bigger/wider primitive dt
        
        // Implicit Process
        
        byte v = 124;
        
        short v1 = v;
        int v2 = v;
        long v3 = v;
        float v4 = v;
        double v5 = v;
        char v6 = (char)v;   // Incompatible types
        
        short a = 124;
        
        int a1 = a;
        long a2 = a;
        float a3 = a;
        double a4 = a;
        char a5 = (char) a;  // Incompatible types
        
        int x = 124;
        
        long x1 = x;
        float x2 = x;
        double x3 = x;
        char x4 = (char) x;  // Incompatible types
        
        long l = 124;
        double l1 = l;
        
        float f = 3.14F;
        long f1 = (long) f;  // Incompatible types
        
        double d = 3.14;
        long d1 = (long) d;  // Incompatible types
        
        char ch = 'A';
        
        short ch1 = (short) ch;  // Incompatible types
        int ch2 = ch;
        long ch3 = ch;
        float ch4 = ch;
        double ch5 = ch;
        
        boolean bool1 = true;
        boolean bool2 = false;
        
    }   
}
