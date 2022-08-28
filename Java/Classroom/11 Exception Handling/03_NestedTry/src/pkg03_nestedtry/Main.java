
package pkg03_nestedtry;

class ExceptionHandling
{
    public void nestedBlocks()
    {
        try
        {
            try
            {
                int a = 50/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            
            System.out.println("Rest of the code 1");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code 2");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.nestedBlocks();
    }
}
