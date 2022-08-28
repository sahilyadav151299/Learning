
package pkg02_foreach;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        
        int A[] = new int[5];
        
        A[0] = 15;
        A[1] = 30;
        A[2] = 45;
        A[3] = 60;
        A[4] = 75;
        
        for(int val : A)
        {
            System.out.println(val);
        }    
    }
    
}
