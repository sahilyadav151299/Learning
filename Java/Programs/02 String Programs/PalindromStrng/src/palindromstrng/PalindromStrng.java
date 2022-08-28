
package palindromstrng;

import java.util.Scanner;

class MyString
{
    public static boolean checkPalindrom(String str)
    {
        StringBuilder tempStr = new StringBuilder(str);
        
        String rev = tempStr.reverse().toString();
        
        if(str.equals(rev))
            return true;
        else
            return false;
    }
}

public class PalindromStrng 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        String str = kb.nextLine();
        
        System.out.println(MyString.checkPalindrom(str));
    }
}
