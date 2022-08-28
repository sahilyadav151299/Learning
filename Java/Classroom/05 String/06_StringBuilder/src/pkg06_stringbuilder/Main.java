
package pkg06_stringbuilder;

public class Main 
{
    public static void main(String[] args) 
    {
        // StringBuilder class is used to create mutable (modifiable) string. 
        // The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
        // Not thread-safe.
        
        StringBuilder s1 = new StringBuilder("Hello");
        
        System.out.println(s1.length());
        System.out.println(s1);
        
        s1.append(" Java");
        System.out.println(s1);
        
        char ch = s1.charAt(6);
        System.out.println(ch);
        
        int idx = s1.indexOf("Java");
        System.out.println(idx);
        
        s1.reverse();
        System.out.println(s1);
    }  
}
