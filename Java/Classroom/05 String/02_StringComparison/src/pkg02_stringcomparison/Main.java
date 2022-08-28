
package pkg02_stringcomparison;

public class Main 
{
    public static void main(String[] args) 
    {
        // Compare string the basis of content(object) and reference(address).
        // It is used in 
        // 1) authentication (by equals() method), 
        // 2) sorting (by compareTo() method), 
        // 3) reference matching (by == operator)
        
        
        String s1 = "Sahil";
        String s2 = "Sahil";
        String s3 = "Vishal";
        String s4 = new String("Vishal");
        String s5 = new String("Vishal");
        String s6 = new String("Sahil");
        
        
        // 1) Using equals() method, compares the original content of the string
        
        // public boolean equals(Object another) 
        // public boolean equalsIgnoreCase(String another) 
        
        System.out.println(s1.equals(s2));      // true
        System.out.println(s1.equals(s3));      // false
        System.out.println(s1.equals(s6));      // true 
        System.out.println(s4.equals(s5));      // true
        System.out.println(s4.equals(s6));      // false
        
        
        // 2) Compare By == Operator, compares references(addresses) not values

        System.out.println(s1==s2);      // true
        System.out.println(s1==s3);      // false
        System.out.println(s1==s6);      // false
        System.out.println(s4==s5);      // false
        System.out.println(s4==s6);      // false
        
        
        // 3) compareTo() method compares values lexicographically and returns an integer value
        // s1 == s2 : 0
        // s1 > s2  : +value
        // s1 < s2  : -value

        System.out.println(s1.compareTo(s2));      // 0
        System.out.println(s1.compareTo(s3));      // -3  S is 3 times lower than V
        System.out.println(s1.compareTo(s6));      // 0 
        System.out.println(s4.compareTo(s5));      // 0
        System.out.println(s4.compareTo(s6));      // +3  V is 3 times greater than S      
        
    }    
}
