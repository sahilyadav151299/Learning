
package pkg07_jaggedarray;

public class Main 
{
    public static void main(String[] args) 
    {
        
        // Example 1
        
        int A[][] = {{10,20},{30,40,50},{60,70,80,90}};
        
        for(int B[] : A)
        {
            for(int val : B)
            System.out.println(val);    
        }   
        
        
        // Example 2
        
        int X[][] = new int[3][];
        
        X[0] = new int[2];
        X[0][0] = 10;
        X[0][1] = 20;
        X[1] = new int[]{30,40,50};
        X[2] = new int[]{60,70,80,90};
        
        for(int B[] : X)
        {
            for(int val : B)
            System.out.println(val);    
        }
        
        
        // Example 3
        
        int S[][] = new int[2][];
        
        S[0] = new int[3];
        S[1] = new int[2];
        
        int count = 0;
        
        for(int i=0; i<S.length; i++)
        {
            for(int j=0; j<S[i].length; j++)
            S[i][j] = ++count;    
        }
        
        for(int T[] : S)
        {
            for(int val : T)
            System.out.println(val);    
        }    
    }    
}
