
package pkg02_switch;

public class Main
{   
    public static void main(String[] args) 
    {
        
        // 1) Usnig Integer Literals
        
        int week = 7;
        
        switch(week)
        {
            case 1: System.out.println("Monday"); break;  
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default : System.out.println("Week Not Found");
        }
        
        
        // 2) Using Character Literals
        
        char ch = 'z';
        
        switch(ch)
        {
            case 'a': case 'e': case 'i': case 'o': case 'u': System.out.println("Vowel"); break;
            default : System.out.println("Consonant");    
        }
        
        
        // 3) fall Through If Break Not
        
        int temp = 10;
        
        switch(temp)
        {
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            default: System.out.println("30");    
        }
        
        
        // 4) Using String Literals
        
        String opr = "mul";
        int a = 10;
        int b = 20;
        
        switch(opr)
        {
            case "add": System.out.println(a+b); break;
            case "sub": System.out.println(a-b); break;
            case "mul": System.out.println(a*b); break;
            case "div": System.out.println(a/b); break;
            default : System.out.println("Opr Not Found");    
        }
        
        
        // 5) Nested Switch
        
        String IITName = "Bombay";
        String subject = "CSE";
        
        switch(IITName)
        {
            case "Bombay": switch(subject) 
                           {
                                case "CSE": System.out.println("300000/- Fees"); break;
                                case "EX": System.out.println("200000/- Fees"); break;
                                case "ME": System.out.println("250000/- Fees"); break;    
                           }
                           break;
            
            case "Delhi": switch(subject) 
                           {
                                case "CSE": System.out.println("400000/- Fees"); break;
                                case "EX": System.out.println("250000/- Fees"); break;
                                case "ME": System.out.println("200000/- Fees"); break;    
                           }
                           break;
        }
        
        
        // 6) Wrapper in Switch Statement
        // Java allows us to use four wrapper classes
        // Byte, Short, Integer and Long in switch statement.
        
        Integer n = 25;
        
        switch(n)
        {
            case 10: System.out.println("10"); break;
            case 20: System.out.println("20"); break;
            default: System.out.println("30");    
        }
        
    }    
}
