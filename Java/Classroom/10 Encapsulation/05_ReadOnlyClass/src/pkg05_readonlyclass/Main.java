
package pkg05_readonlyclass;

class ReadOnlyClass
{
    private String college = "ITUS";
    
    public static String getCollege()
    {
        return new ReadOnlyClass().college;
    }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        System.out.println(ReadOnlyClass.getCollege());
    }   
}