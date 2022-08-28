
package pkg04_metacharacters;

/*      The regular expression metacharacters work as shortcodes.

        .	Any character (may or may not match terminator)
        \d	Any digits, short of [0-9]
        \D	Any non-digit, short for [^0-9]
        \s	Any whitespace character, short for [\t\n\x0B\f\r]
        \S	Any non-whitespace character, short for [^\s]
        \w	Any word character, short for [a-zA-Z_0-9]
        \W	Any non-word character, short for [^\w]
        \b	A word boundary
        \B	A non word boundary
*/

import java.util.regex.Pattern;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches(".", "a"));      // true
        System.out.println(Pattern.matches(".", "aa"));     // false
        System.out.println(Pattern.matches(".", "+"));      // true
        System.out.println(Pattern.matches(".", "."));      // true
        
        System.out.println();
        
        System.out.println(Pattern.matches("\\d", "a"));    // false
        System.out.println(Pattern.matches("\\d", "5"));    // true
        System.out.println(Pattern.matches("\\d", "aa"));   // false
        System.out.println(Pattern.matches("\\d", "55"));   // false
        
        System.out.println();
        
        System.out.println(Pattern.matches("\\D", "a"));    // true
        System.out.println(Pattern.matches("\\D", "aa"));   // false
        System.out.println(Pattern.matches("\\D", "0"));    // false
        System.out.println(Pattern.matches("\\D", "+"));    // true
        
        System.out.println();
        
        System.out.println(Pattern.matches("\\w", "a"));    // true
        System.out.println(Pattern.matches("\\w", "A"));    // true
        System.out.println(Pattern.matches("\\w", "9"));    // true
        System.out.println(Pattern.matches("\\w", "+"));    // false
        System.out.println(Pattern.matches("\\w", "aa"));   // false
    }  
}
