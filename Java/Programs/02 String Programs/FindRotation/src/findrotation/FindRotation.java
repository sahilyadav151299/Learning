
package findrotation;

import java.util.Scanner;

class MyString
{
    public static boolean findRotation(String s1, String s2)
    {
        boolean status = false;
        
        if(s1.length() != s2.length())
            return status;
        
        String str3 = s1 + s1;
        
        if(str3.contains(s2))
            status = true;
        else
            status = false;
        
        return status;
    }
}

public class FindRotation 
{
    public static void main(String[] args) 
    {
	Scanner kb = new Scanner(System.in);
        
        String s1 = kb.nextLine();
        String s2 = kb.nextLine();
  
        System.out.println(MyString.findRotation(s1, s2));
    }  
}
