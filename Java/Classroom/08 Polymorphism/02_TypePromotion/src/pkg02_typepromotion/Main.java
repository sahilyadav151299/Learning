
package pkg02_typepromotion;

// One type is promoted to another implicitly if no matching datatype is found.
// byte -> short -> int 
// int -> long/float/double
// char -> int
// int/float/long -> double

// Method Overloading with TypePromotion

class Calc1
{
    public static void sum(int a,long b){System.out.println(a+b);}  
    public static void sum(int a,int b,int c){System.out.println(a+b+c);}
}

// Method Overloading with Type Promotion if matching found

class Calc2
{
    public static void sum(int a,int b){System.out.println(a+b);}  
    public static void sum(long a, long b){System.out.println(a+b);}
}

// Method Overloading with Type Promotion in case of ambiguity
class Calc3
{
    public static void sum(int a,long b){System.out.println(a+b);}  
    public static void sum(long a, int b){System.out.println(a+b);}
}

public class Main 
{
    public static void main(String[] args) 
    {
        Calc1.sum(10, 20);          // Second int literal will be promoted to long  
        Calc1.sum(10, 20, 30);
        
        Calc2.sum(20,20);           // int arg sum() method gets invoked  
        
        Calc3.sum(10, 20L);         // Ambiguity without dpecification 
    }    
}
