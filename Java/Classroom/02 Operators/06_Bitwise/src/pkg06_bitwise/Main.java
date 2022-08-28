
package pkg06_bitwise;

public class Main 
{ 
    public static void main(String[] args) 
    {
        // There are 7 operators to perform bit-level operations in Java
        
        // 1) Bitwise OR Operator == |
        
        int v1 = 12;                    // 00001100               
        int v2 = 25;                    // 00011001
        System.out.println(v1 | v2);    // 00011101 = 29    
        
        // 2) Bitwise AND Operator == &
        
        int v3 = 12;                    // 00001100               
        int v4 = 25;                    // 00011001
        System.out.println(v3 & v4);    // 00001000 = 8  
        
        // 3) Bitwise XOR Operator == ^
        
        int v5 = 12;                    // 00001100               
        int v6 = 25;                    // 00011001
        System.out.println(v5 ^ v6);    // 00010101 = 21  
        
        // 4) Bitwise Complement Operator == ~  (Give 2's complement)
        
        int v7 = 35; 
        int v8 = ~v7;
        System.out.println(v8);         // N ==  -(N+1).
        
        int v9 = -35;
        int v10 = ~v9;
        System.out.println(v10);        // -N == (N-1).
        
        // 5) Signed Left Shift Operator == <<
        
        int v11 = 4;
        System.out.println(v11<<2);    //  4*2 = 8*2 = 16
        
        // 6) Signed Right Shift Operator == >>
        
        int v12 = 16;
        System.out.println(v11>>2);    //  16/2 = 8/2 = 4
        
        // 7) Unsigned Right Shift Operator == >>>  (Fills 0's from the left most side)
        
        int v13 = 8;
        System.out.println(8>>>2);    // 00001000 == 00000010
        
        
    }    
}
