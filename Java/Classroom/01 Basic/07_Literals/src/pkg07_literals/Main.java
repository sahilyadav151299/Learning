
package pkg07_literals;

public class Main 
{
    public static void main(String[] args) 
    {
        // Literals are data used for representing fixed values
        
        // Boolean Literals
        
        boolean flag1 = false;          
        boolean flag2 = true;    
        
        System.out.println(flag1);
        System.out.println(flag2);
        
        // Integer Literals
        
        int binary = 0b10010;      // 0b for binary with 0 & 1          
        int octal = 027;           // 0 for octal with 0 - 7                    2x8^1 + 7x8^0 = 23
        int decimal = 34;          // 0-9 digit
        int hexadecimal = 0x2F;    // ox for hexadecimal with 0-9 & A-F         2x16^1 + 15x16^0 = 47
        
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(decimal);
        System.out.println(hexadecimal);
        
        // Floating Point Literals
        
        float pivalue = 3.14F;
        double value = 2546.0444;
        double scientific = 3.445e2;
        
        System.out.println(pivalue);
        System.out.println(value);
        System.out.println(scientific);
        
        // Character Literals
        
        char ch1 = 'A';
        char ch2 = '\n';
        
        System.out.println(ch1);
        System.out.println(ch2);
        
        // String Literals
        
        String str1 = "Sahil Yadav";
        String str2 = "Learn";
        
        System.out.println(str1);
        System.out.println(str2);
    } 
}
