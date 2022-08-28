
package pkg06_finalclass;

// Any class as final, can't be extended

final class Math 
{
    public static int cube(int n)
    {
        return n*n*n;
    }
    
    public static int square(int n)
    {
        return n*n;
    }
}
        
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Math.square(4));
        System.out.println(Math.cube(4));
    }
}