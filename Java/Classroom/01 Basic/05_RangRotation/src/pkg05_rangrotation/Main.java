
package pkg05_rangrotation;

public class Main 
{
    public static void main(String[] args) 
    {
        //Byte Range -128 to 127
        
        byte v1 = -128;
        byte v2 = 127;
        byte v3 = (byte) 128;   // Range Rotate 1 : -128
        byte v4 = (byte) -129;  // Range Rotate 1 : 127
        byte v5 = (byte) 130;   // Range Rotate 3 : -128 -127 -126
        byte v6 = (byte) -130;  // Range Rotate 2 : 127 126
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
    }    
}
