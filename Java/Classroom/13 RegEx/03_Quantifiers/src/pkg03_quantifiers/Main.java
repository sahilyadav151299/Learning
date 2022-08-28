
package pkg03_quantifiers;

/*      The quantifiers specify the number of occurrences of a character

        X?	X occurs once or not at all
        X+	X occurs once or more times
        X*	X occurs zero or more times
        X{n}	X occurs n times only
        X{n,}	X occurs n or more times
        X{y,z}	X occurs at least y times but less than z times
*/

import java.util.regex.Pattern;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches("[abc]?", "a"));     // true (One time)
        System.out.println(Pattern.matches("[abc]?", "aa"));    // false (More than one time)
        System.out.println(Pattern.matches("[abc]?", "amn"));   // false (One char only)
        
        System.out.println();
        
        System.out.println(Pattern.matches("[abc]+", "a"));         // true
        System.out.println(Pattern.matches("[abc]+", "aaa"));       // true
        System.out.println(Pattern.matches("[abc]+", "aabbcc"));    // true
        System.out.println(Pattern.matches("[abc]+", "dddd"));      // false
        
        System.out.println();
        
        System.out.println(Pattern.matches("[abc]{4}", "aaaa"));    // true
        System.out.println(Pattern.matches("[abc]{4}", "aa"));      // false
        System.out.println(Pattern.matches("[abc]{4}", "aaaaa"));   // false
    }  
}
