
package pkg02_charclass;

/*      Only Characters : Charachter Class

1)	[abc]           among a, b, or c (simple class)
2)	[^abc]          Any character except a, b, or c (negation)
3)	[a-zA-Z]	a through z or A through Z, inclusive (range)
4)	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5)	[a-z&&[def]]	d, e, or f (intersection)
6)	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7)	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)  
*/

import java.util.regex.Pattern;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Pattern.matches("[abc]", "abc"));    // false
        System.out.println(Pattern.matches("[abc]", "a"));      // true (Only 1 among abc)
        System.out.println(Pattern.matches("[abc]", "aa"));     // false
        System.out.println(Pattern.matches("[abc]", "d"));      // false
        System.out.println(Pattern.matches("[abc]", "b"));      // true (Only 1 among abc)  
        
        System.out.println();
        
        System.out.println(Pattern.matches("[^abc]", "abc"));   // false
        System.out.println(Pattern.matches("[^abc]", "a"));     // false
        System.out.println(Pattern.matches("[^abc]", "z"));     // true  (Only char)
        System.out.println(Pattern.matches("[^abc]", "xyz"));   // false (Only char not string)
        
        System.out.println();
        
        System.out.println(Pattern.matches("[a-z]", "a"));       // true
        System.out.println(Pattern.matches("[a-z]", "A"));       // false
        System.out.println(Pattern.matches("[a-z A-Z]", "X"));   // true
        System.out.println(Pattern.matches("[a-z A-Z]", "f"));   // true
        System.out.println(Pattern.matches("[A-Z]", "g"));       // false
        System.out.println(Pattern.matches("[0-9]", "A"));       // false
        System.out.println(Pattern.matches("[0-9]", "5"));       // true
        
        System.out.println();
        
        System.out.println(Pattern.matches("[a-d [m-p]]", "g"));    // false
        System.out.println(Pattern.matches("[a-d [m-p]]", "o"));    // true
        System.out.println(Pattern.matches("[a-d m-p]", "g"));      // false
        System.out.println(Pattern.matches("[a-d m-p]", "o"));      // true
    
    }  
}