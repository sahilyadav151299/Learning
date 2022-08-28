
package pkg04_finalvariable;

// The final keyword in java is used to restrict the user.
// Any variable as final, It will be constant.

class Demo
{
    final int speedLimit = 100;      // Final Variable
    final int PAN_CARD_NUMBER;       // Blank Final Variable (Use in Constructor only)
    static final int data;           // Static Blank Final Variable (Use in Static Block only)
    
    Demo(int panCard) 
    { 
        PAN_CARD_NUMBER = panCard; 
    }
    
    static
    { 
        data = 246813579; 
    }
    
    public int cube(final int n)    // Parameter Can't Be Modified
    {
        return n*n*n;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Demo d = new Demo(123456);
        
        System.out.println(d.speedLimit);
        System.out.println(d.PAN_CARD_NUMBER);
        System.out.println(d.data);
        System.out.println(d.cube(6));
    }
}
