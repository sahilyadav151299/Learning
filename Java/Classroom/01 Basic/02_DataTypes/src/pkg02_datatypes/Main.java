
package pkg02_datatypes;

public class Main 
{
    public static void main(String[] args) 
    { 
        // 8 Primitive Data Types With Default Value/Size/Range
        
        byte v1 = 0;           // 1 byte    -128 to 127
        
        short v2 = 0;          // 2 byte    -32768 to 32767
        
        int v3 = 0;            // 4 byte    -2147483648 to 2147483647
            
        long v4 = 0L;          // 8 byte    -922337203684775808 to 922337203684775807
                            
        float v5 = 0.0F;       // 4 byte    -3.4 x 10^38 to 3.4 x 10^38
                            
        double v6 = 0.0D;      // 8 byte    -1.4 x 10^308 to 1.4 x 10^308
        
        char v7 = '\u0000';    // 2 byte    0 to 65535 (\u0000 to \uffff) The \u0000 is the lowest range of Unicode system
                            
        boolean v8 = false;    // This dt represents 1 bit of information, but its "size" isn't something that's precisely
        
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
        System.out.println(v8);
        /*
        
        Non-Primitive Data Types
        
        1) Class
        2) Array
        3) Interface
        
        */
    }   
}
