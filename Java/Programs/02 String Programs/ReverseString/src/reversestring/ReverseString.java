
package reversestring;

import java.util.Scanner;

class MyString
{
    public static String reverseString1(String str)
    {
        StringBuilder str1 = new StringBuilder(str);
        
        str1.reverse();
        
        return str1.toString();
    }
    
    public static String reverseString2(String str)
    {
        char arr[] = str.toCharArray();
        
        String rev = "";
        
        for(int i=arr.length-1; i>=0; i--)
            rev += arr[i];
        
        return rev;
    }
}

public class ReverseString 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        String str = kb.nextLine();
        
        System.out.println(MyString.reverseString1(str));
        System.out.println(MyString.reverseString2(str));
    }     
}
