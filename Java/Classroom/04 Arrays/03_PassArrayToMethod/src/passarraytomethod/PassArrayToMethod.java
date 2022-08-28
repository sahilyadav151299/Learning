
package passarraytomethod;

public class PassArrayToMethod 
{
    static void show(int A[])
    {
        for(int val : A)
        {
            System.out.println(val); 
        }   
    }
    
    public static void main(String[] args) 
    {
        int A[] = new int[5];
        
        A[0] = 12;
        A[1] = 24;
        A[2] = 36;
        A[3] = 48;
        A[4] = 60;
        
        show(A);
    }
    
}
