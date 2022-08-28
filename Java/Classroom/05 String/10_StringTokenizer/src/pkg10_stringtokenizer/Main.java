
package pkg10_stringtokenizer;

import java.util.StringTokenizer;

public class Main 
{
    public static void main(String[] args) 
    {
        // The java.util.StringTokenizer class allows you to break a string into tokens.
        
        StringTokenizer st = new StringTokenizer("My name is Sahil"," ");
        
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());    
        
        System.out.println(st.countTokens());
    }   
}
