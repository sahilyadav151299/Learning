
package pkg07_other;

public class Main 
{
    public static void main(String[] args) 
    {
        // Ternary Operator
        
        int feb = 29;
        String result;
        
        result = (feb == 28) ? "Not A Leap Year" : "Leap Year";
        
        System.out.println(result);
        
        // instanceof Operator
        
        String str = "Programiz";
        boolean res;
        
        res = str instanceof String;
        System.out.println("Is str an object of String? " + res);   
        
    }
}
