
package captializeeachword;

import java.util.Scanner;

class MyString
{
    public static String captializeString(String str)
    {
        String words[] = str.split("\\s");
        
        String captialized = "";
        
        for(String word : words)
        {
            captialized += word.toUpperCase();
            captialized += " ";
        }
        
        return captialized.trim();
    }
}

public class CaptializeEachWord 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        String str = kb.nextLine();
        
        System.out.println(MyString.captializeString(str));
    } 
}
