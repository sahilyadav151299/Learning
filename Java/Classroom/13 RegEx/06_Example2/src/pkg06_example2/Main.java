
package pkg06_example2;

// Create a regular expression that accepts 10 digit numeric characters 
// starting with 7, 8 or 9 only

import java.util.regex.Pattern;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9876543210"));  // true start 9 & rest 9 digits
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6876543210"));  // false start 6
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "98765432100")); // false start 9 & rest 10 digits
        
        System.out.println(Pattern.matches("[789][0-9]{9}", "9876"));           // false start 9 & rest 3 digits
        System.out.println(Pattern.matches("[789][0-9]{9}", "6876"));           // false start 9
        
        System.out.println(Pattern.matches("[789]\\d{9}", "9876543210"));       // true 
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "9876543210"));    // true
    }  
}