
package pkg07_example3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter Pattern To Be Matched");
        
        Pattern pattern = Pattern.compile(read.nextLine());
        
        System.out.println("Enter String For Pattern Matching");
        
        Matcher match = pattern.matcher(read.nextLine());
        
        boolean found = false;
        
        while(match.find())
        {
            String text = match.group();
            int idx1 = match.start();
            int idx2 = match.end();
            
            System.out.println(text + " Found At Starting Index " +idx1+ " & At Ending Index " +idx2);
            
            found = true;
        }
        
        if(found == false)
            System.out.println("No Match Found");
    }  
}
