
package pkg01_regexapi;

// Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
// It is widely used to define the constraint on strings such as password and email validation.

// Java Regex API provides 1 interface and 3 classes in java.util.regex package.

// 1) MatchResult interface
// 2) Matcher class, is a regex engine which is used to perform match operations on a character sequence.
// 3) Pattern class, is used to define a pattern for the regex engine.
// 4) PatternSyntaxException class

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1) One Way
        
        Pattern p = Pattern.compile(".s");  // Dot -> Single Char
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        
        System.out.println(b);
        
        // 2) Second Way
        
        boolean r = Pattern.compile(".s").matcher("as").matches();
        
        System.out.println(r);
        
        // 3) Third Way
        
        boolean x = Pattern.matches(".s", "as");
        
        System.out.println(x);
       
        System.out.println(Pattern.matches(".s", "as"));    // true 2nd s
        System.out.println(Pattern.matches(".s", "sa"));    // false 2nd a
        System.out.println(Pattern.matches(".s", "ass"));   // false more than 2
        System.out.println(Pattern.matches(".s", "aas"));   // false more than 2
        System.out.println(Pattern.matches("..s", "ass"));  // true 3rd s
        
    }  
}