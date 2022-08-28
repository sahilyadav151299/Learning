
package pkg08_hashcodetest;

public class Main 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";
        System.out.println(s1.hashCode());
        
        String s2 = "Hello";
        System.out.println(s2.hashCode());
        
        StringBuffer s3 = new StringBuffer("Hello");
        System.out.println(s3.hashCode());
        
        StringBuffer s4 = new StringBuffer("Hello");
        System.out.println(s4.hashCode());
        
        s1 = s1 + "Java";
        System.out.println(s1.hashCode());
        
        s2 = s2 + "Java";
        System.out.println(s2.hashCode());
        
        s3.append("Java");
        System.out.println(s3.hashCode());
        
        s4.append("Java");
        System.out.println(s4.hashCode());
    }    
}
