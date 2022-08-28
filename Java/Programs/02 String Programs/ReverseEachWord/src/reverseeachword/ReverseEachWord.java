
package reverseeachword;

import java.util.Scanner;

class MyString
{
    public static String reverseEachWord(String str)
    {
        String words[] = str.split("\\s");
        
        String reversedWords = "";
        
        for(String word : words)
        {
            StringBuilder temp = new StringBuilder(word);
            
            reversedWords += temp.reverse().toString() + " ";
        }
        
        return reversedWords.trim();
    }
}

public class ReverseEachWord 
{
    public static void main(String[] args) 
    {
	Scanner kb = new Scanner(System.in);
        
        String str = kb.nextLine();
        
        System.out.println(MyString.reverseEachWord(str));
    } 
}
