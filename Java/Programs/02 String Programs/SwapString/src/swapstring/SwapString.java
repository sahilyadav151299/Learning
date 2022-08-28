
package swapstring;

import java.util.Scanner;

class MyString
{
    public static void swapString(String s1, String s2)
    {
        System.out.println("Before Swapping " + s1 + " And " + s2);
        
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        
        System.out.println("After Swapping " + s1 + " And " + s2);
    }
}

public class SwapString 
{
    public static void main(String[] args) 
    {
	Scanner kb = new Scanner(System.in);
        
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
       
        MyString.swapString(str1, str2);
    }  
}
