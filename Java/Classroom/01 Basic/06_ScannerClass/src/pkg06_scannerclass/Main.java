
package pkg06_scannerclass;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        
        byte v1 = read.nextByte();
        short v2 = read.nextShort();
        int v3 = read.nextInt();
        long v4 = read.nextLong();
        float v5 = read.nextFloat();
        double v6 = read.nextDouble();
        char v7 = read.next().charAt(0);    // For String read.next()
            
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);
      
    }
}
