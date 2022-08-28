package practice;

import java.sql.Array;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        String str1 = kb.nextLine();
        String str2 = kb.nextLine();
        
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        
        char arr[] = str1.toLowerCase().toCharArray();
        char brr[] = str2.toLowerCase().toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        if(arr.length != brr.length)
            System.out.println("False");
        else{
            if(Arrays.equals(arr, brr))
                System.out.println("true");
        }
        
    }
}
