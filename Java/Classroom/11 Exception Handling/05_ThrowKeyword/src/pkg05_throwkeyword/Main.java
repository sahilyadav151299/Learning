
package pkg05_throwkeyword;

// Used to explicitly throw an exception.
// We can throw either checked or uncheked exception in java by throw keyword. 
// The throw keyword is mainly used to throw custom exception.

class ExceptionHandling
{
    public void throwException(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException("Not Valid Age");
        }
        else
        {
            System.out.println("Can Become A Voter");
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        ExceptionHandling obj = new ExceptionHandling();
        
        obj.throwException(18);
        obj.throwException(17);
    }
}

