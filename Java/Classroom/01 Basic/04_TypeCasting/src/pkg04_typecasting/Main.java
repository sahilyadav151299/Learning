
package pkg04_typecasting;

public class Main 
{
    public static void main(String[] args)
    {
        // Type Casting == Narrowing  
        
        // Larger primitive type value is automatically accommodated in a smaller primitive dt
        
        // Exlicit Process
        
        double d = 3.14;
        
        byte d1 = (byte) d;
        short d2 = (short) d;
        int d3 = (int) d;
        long d4 = (long) d;
        float d5 = (float) d;
        char d6 = (char) d;
        
        float f = 3.14F;
        
        byte f1 = (byte) f;
        short f2 = (short) f;
        int f3 = (int) f;
        long f4 = (long) f;
        char f5 = (char) f;
        
        long l = 124;
        
        byte l1 = (byte) l;
        short l2 = (short) l;
        int l3 = (int) l;
        char l4 = (char) l;
        
        int i = 120;
        
        byte i1 = (byte) i;
        short i2 = (short) i;
        char i3 = (char) i;
        
        short s = 120;
        
        byte s1 = (byte) s;
        char s2 = (char) s;
        
    }   
}
