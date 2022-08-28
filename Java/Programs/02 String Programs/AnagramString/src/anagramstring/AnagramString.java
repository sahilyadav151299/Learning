
package anagramstring;

import java.util.Arrays;
import java.util.Scanner;

class MyString
{
    public static boolean checkAnagrams1(String str1, String str2)
    {
        // replace all whhitespace with blank space
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        
        boolean status = true;
        
        if(s1.length() != s2.length())
            return false;
        
        char arr[] = s1.toLowerCase().toCharArray();
        char brr[] = s2.toLowerCase().toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        status = Arrays.equals(arr, brr);
                
        return status;
    }
    
    public static boolean checkAnagrams2(String str1, String str2)
    {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        
        char s1_arr[] = s1.toLowerCase().toCharArray();
        char s2_arr[] = s2.toLowerCase().toCharArray();
        
        boolean status = false;
        
        if(s1_arr.length != s2_arr.length)
            return status;
        
        int count = 0;
        
        int s1_count[] = new int[26];
        int s2_count[] = new int[26];
        
        for(int i=0; i<s1_arr.length; i++)
        s1_count[s1_arr[i]-97]++;
        
        for(int i=0; i<s2_arr.length; i++)
        s2_count[s2_arr[i]-97]++;
        
        for(int i=0; i<26; i++)
        count += Math.abs(s1_count[i] - s2_count[i]);
        
        if(count != 0)
            return status;
        else
            return true;
    }
}

public class AnagramString 
{  
    public static void main(String[] args) 
    {
	Scanner kb = new Scanner(System.in);
        
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
        
        System.out.println(MyString.checkAnagrams1(str1, str2));
        System.out.println(MyString.checkAnagrams2(str1, str2));
  
    }  
}
