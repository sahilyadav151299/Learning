
package toggleeachword;

import java.util.Scanner;

class MyString
{
    public static String toggleWords(String str)
    {
        String words[] = str.split("\\s");
        
        String toggled = "";
        
        for(String word : words)
        {
            String firstChar = word.substring(0,1);
            String restChar = word.substring(1);
            
            toggled += firstChar.toLowerCase() + restChar.toUpperCase() + " ";
        }
        
        return toggled.trim();
    }
}

public class ToggleEachWord 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        String str = kb.nextLine();
        
        System.out.println(MyString.toggleWords(str));
    }
}
