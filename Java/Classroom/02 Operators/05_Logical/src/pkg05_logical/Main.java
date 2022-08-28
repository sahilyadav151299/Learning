
package pkg05_logical;

public class Main 
{
    public static void main(String[] args) 
    {
        // && Logical AND Operator
        
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || Logical OR Operator
        
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! Logical NOT Operator
        
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }  
}
