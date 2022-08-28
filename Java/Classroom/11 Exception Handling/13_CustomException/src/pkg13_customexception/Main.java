
package pkg13_customexception;


class InvalidAgeException extends Exception
{
    public InvalidAgeException(String s) 
    {
        super(s);
    }   
}

class CustomException
{
    static void validate(int age) throws InvalidAgeException
    {
        if(age<18)
            throw new InvalidAgeException("Not Valid");
        else
            System.out.println("Welcome To Vote");    
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
       try
       {
           CustomException.validate(17);
       }
       catch(InvalidAgeException e)
       {
           System.out.println(e.getMessage());
       }
    }
}
