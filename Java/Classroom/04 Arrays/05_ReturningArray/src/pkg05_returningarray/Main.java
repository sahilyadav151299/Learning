
package pkg05_returningarray;

public class Main 
{
    static int[] get()
    {
        return new int[]{10,20,30,40,50};
    }    
    
    public static void main(String[] args) 
    {
        int A[] = get();
        
        for(int val : A)
        {
            System.out.println(val);
        }    
    }    
}

