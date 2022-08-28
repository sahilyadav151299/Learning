
package pkg05_stringbuffermethod;

public class Main 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer("Hello");          // Capacity 16 + 5 = 21
        
        System.out.println(str.capacity());                    // 21
        System.out.println(str.length());                      // 5
        
        str.append(" Sahil");                                  // Original string is changed 
        System.out.println(str);
        
        str.insert(5, " Java");
        System.out.println(str);
        
        str.replace(6, 10, "Core Java");
        System.out.println(str);
        
        str.delete(6, 11);
        System.out.println(str);
        
        str.reverse();
        System.out.println(str);
    }    
}
