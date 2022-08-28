
package pkg02_multiplecatch;

class ExceptionHandling
{
    int data = 50;
    String name = null;
    
    public void multipleCatch()
    {
        try
        {
            name.length();
            int res = data/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println("Rest of the code");
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.multipleCatch();
    }
}
