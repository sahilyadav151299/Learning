
package pkg04_stringbuffer;

public class Main 
{
    public static void main(String[] args) 
    {
        // StringBuffer class is used to create mutable (modifiable) string.
        // StringBuffer is synchronized i.e. thread safe. 
        // It means two threads can't call the methods of StringBuffer simultaneously.
        
        
        StringBuffer s1 = new StringBuffer();           // Capacity : 16
                
        System.out.println(s1.length());                // 0
        System.out.println(s1.capacity());              // 16
        
        
        StringBuffer s2 = new StringBuffer("Hello");    // Capacity : 16 + 5 = 21
        
        System.out.println(s2.length());                // 5
        System.out.println(s2.capacity());              // 21
        
        
        StringBuffer s3 = new StringBuffer(50);         // Capacity : 50
        
        System.out.println(s3.length());                // 0
        System.out.println(s3.capacity());              // 50
        
    }    
}
