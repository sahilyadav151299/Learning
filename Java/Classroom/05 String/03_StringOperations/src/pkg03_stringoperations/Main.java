
package pkg03_stringoperations;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1) Concatinate String Using + Operator
        
        String s1 = "Sahil";
        String s2 = " Yadav";
        String s3 = s1 + s2;
        
        System.out.println(s3);
        
        
        // 2) Concatinate String Using concat() Method
        
        String s4 = "Hello";
        String s5 = " World";
        
        s4 = s4.concat(s5);
        
        System.out.println(s4);
        
        
        // 3) Substring of String
        
        String s6 = "MyNameIsKhan";
        
        System.out.println(s6.substring(2));
        System.out.println(s6.substring(2,8));
        
        
        // 4) Upper & Lower Case
        
        String s7 = s6.toUpperCase();
        String s8 = s6.toLowerCase();
        
        System.out.println(s7);
        System.out.println(s8);
        
        
        // 5) trim() method eliminates white spaces before and after string
        
        String s9 = "    S A H I L    ";
        String s10 = "   Vishal  ";
        
        System.out.println(s9.trim());
        System.out.println(s10.trim());
        
        // 6) Other Methods
        
        String s11 = "Sahil Yadav ";
        int age = 20;
        
        System.out.println(s11.charAt(4));              // Returns char at index 4
        
        System.out.println(s11.length());               // Returns length of string
        
        System.out.println(s11 + String.valueOf(20));   // Returns string value
        
        
    }    
}
