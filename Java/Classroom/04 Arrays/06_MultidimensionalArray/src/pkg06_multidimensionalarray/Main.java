
package pkg06_multidimensionalarray;

public class Main 
{
    public static void main(String[] args) 
    {
        int A[][] = new int[2][2];
        
        A[0][0] = 10;
        A[0][1] = 20;
        A[1][0] = 30;
        A[1][1] = 40;
        
        for(int B[] : A)
        {
            for(int val : B)
            System.out.println(val);      
        }    
        
        
        int C[][] = new int[][]{{10,20},{30,40}};
        
        int D[][] = {{10,20},{30,40}};
           
    }   
}
