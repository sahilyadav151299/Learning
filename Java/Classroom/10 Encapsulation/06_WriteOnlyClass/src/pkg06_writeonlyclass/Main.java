
package pkg06_writeonlyclass;

class WriteOnlyClass
{
    private String college;
    
    public static void setCollege(String college)
    {
        WriteOnlyClass object = new WriteOnlyClass();
        object.college = college;
    }
}

public class Main 
{    
    public static void main(String[] args) 
    {
        WriteOnlyClass.setCollege("ITUS");
    }   
}