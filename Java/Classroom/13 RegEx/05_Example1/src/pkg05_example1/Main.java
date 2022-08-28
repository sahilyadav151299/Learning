
package pkg05_example1;

// Create a regular expression that accepts alphanumeric characters only.  
// Its length must be six characters long only.
 
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter Any Alphanumeric String Having Length Excatly 6.");
        
        String str = kb.next();
        
        boolean b = Pattern.matches("[a-zA-Z0-9]{6}", str);
        
        if(b == true)
            System.out.println("Sring Is Valid.");
        else
            System.out.println("String Is Invalid.");
    }  
}
